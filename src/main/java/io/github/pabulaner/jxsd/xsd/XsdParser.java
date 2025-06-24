package io.github.pabulaner.jxsd.xsd;

import com.sun.xml.xsom.XSAttributeDecl;
import com.sun.xml.xsom.XSComplexType;
import com.sun.xml.xsom.XSContentType;
import com.sun.xml.xsom.XSElementDecl;
import com.sun.xml.xsom.XSListSimpleType;
import com.sun.xml.xsom.XSModelGroup;
import com.sun.xml.xsom.XSParticle;
import com.sun.xml.xsom.XSRestrictionSimpleType;
import com.sun.xml.xsom.XSSchemaSet;
import com.sun.xml.xsom.XSSimpleType;
import com.sun.xml.xsom.XSTerm;
import com.sun.xml.xsom.XSType;
import com.sun.xml.xsom.XSUnionSimpleType;
import com.sun.xml.xsom.XmlString;
import com.sun.xml.xsom.parser.XSOMParser;
import org.docx4j.dml.chart.CTAxDataSource;
import org.docx4j.dml.chart.CTCatAx;
import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParserFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class XsdParser {

    public static final String SIMPLE_TYPE = "simpleType";

    public static final String ANY_SIMPLE_TYPE = "anySimpleType";

    private XsdScope scope;

    public XsdParser() {
        scope = null;
    }

    public XsdResult parse(URL url) throws SAXException {
        scope = new XsdScope();

        XSOMParser parser = new XSOMParser(SAXParserFactory.newInstance());
        parser.parse(url);

        XSSchemaSet set = parser.getResult();
        List<XsdStruct> structs = new ArrayList<>();

        set.getSchemas().forEach(schema -> {
            schema.getTypes()
                    .values()
                    .stream()
                    .map(this::parse)
                    .filter(xs -> !SIMPLE_TYPE.equals(xs.type().name()))
                    .filter(xs -> !ANY_SIMPLE_TYPE.equals(xs.type().name()))
                    .filter(xs -> xs.type().parentName() != null)
                    .forEach(structs::add);
        });

        return new XsdResult(scope, structs);
    }

    private XsdStruct parse(XSType xs) {
        return xs.isSimpleType()
                ? parseSimpleType(xs.asSimpleType())
                : parseComplexType(xs.asComplexType());
    }

    private XsdSimpleStruct parseSimpleType(XSSimpleType xs) {
        XsdType type = parseType(xs);

        if (xs.isPrimitive()) {
            return new XsdSimpleStruct.XsdPrimitiveStruct(type);
        }

        if (xs.isRestriction()) {
            XSRestrictionSimpleType restriction = xs.asRestriction();
            List<XsdRestriction> restrictions = restriction.getDeclaredFacets()
                    .stream()
                    .map(facet -> new XsdRestriction(
                            facet.getName(),
                            parseString(facet.getValue())))
                    .collect(Collectors.toList());

            return new XsdSimpleStruct.XsdRestrictionStruct(type, restrictions);
        }

        if (xs.isList()) {
            XSListSimpleType list = xs.asList();
            XsdType itemType = parseType(list.getItemType());

            return new XsdSimpleStruct.XsdListStruct(type, itemType);
        }

        if (xs.isUnion()) {
            XSUnionSimpleType union = xs.asUnion();
            List<XsdType> types = new ArrayList<>();

            union.forEach(xsType -> types.add(parseType(xsType)));
            return new XsdSimpleStruct.XsdUnionStruct(type, types);
        }

        throw new IllegalStateException("Unreachable");
    }

    private XsdComplexStruct parseComplexType(XSComplexType xs) {
        XsdType type = parseType(xs);

        List<XsdValue> values = xs.getAttributeUses()
                .stream()
                .map(attr -> {
                    XSAttributeDecl decl = attr.getDecl();
                    XSType declType = decl.getType();
                    String name = decl.getName();
                    XsdStruct struct;
                    XsdType attrType;

                    // check if the element has an anonymous type
                    if (declType.getName() == null) {
                        struct = parse(declType);
                        attrType = parseType(name, declType);
                    } else {
                        struct = null;
                        attrType = parseType(declType);
                    }

                    return new XsdElementValue(1, 1,
                            struct,
                            attrType,
                            name,
                            parseString(attr.getDefaultValue()));
                })
                .collect(Collectors.toList());

        XSContentType content = xs.getContentType();

        if (content != null) {
            XSSimpleType simple = content.asSimpleType();
            XSParticle particle = content.asParticle();

            if (simple != null) {
                throw new IllegalStateException("Unreachable");
            }

            if (particle != null) {
                XsdValue value = parseParticle(particle);

                if (value != null) {
                    values.add(value);
                }
            }
        }

        while (values.size() == 1) {
            XsdValue value = values.getFirst();

            if (value instanceof XsdGroupValue group) {
                if (group.kind() == XsdGroupValue.Kind.SEQUENCE) {
                    values = group.values();
                } else if (group.values().size() == 1) {
                    values = group.values();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return new XsdComplexStruct(type, values);
    }

    private XsdValue parseParticle(XSParticle xs) {
        XSTerm term = xs.getTerm();
        int minOccurs = xs.getMinOccurs().intValue();
        int maxOccurs = xs.getMaxOccurs().intValue();

        if (minOccurs == -1) minOccurs = Integer.MAX_VALUE;
        if (maxOccurs == -1) maxOccurs = Integer.MAX_VALUE;

        if (term.isElementDecl()) {
            XSElementDecl element = term.asElementDecl();
            XSType xsType = element.getType();
            String name = element.getName();
            XsdStruct struct;
            XsdType type;

            // check if the element has an anonymous type
            if (element.getType().getName() == null) {
                struct = parse(xsType);
                type = parseType(name, xsType);
            } else {
                struct = null;
                type = parseType(xsType);
            }

            return new XsdElementValue(
                    minOccurs,
                    maxOccurs,
                    struct,
                    type,
                    name,
                    parseString(element.getDefaultValue()));
        }

        if (term.isModelGroup() || term.isModelGroupDecl()) {
            XSModelGroup group = term.isModelGroup()
                    ? term.asModelGroup()
                    : term.asModelGroupDecl().getModelGroup();

            XsdGroupValue.Kind kind = switch (group.getCompositor()) {
                case SEQUENCE, ALL -> XsdGroupValue.Kind.SEQUENCE;
                case CHOICE -> XsdGroupValue.Kind.UNION;
            };

            List<XsdValue> values = new ArrayList<>();

            group.forEach(particle -> {
                XsdValue value = parseParticle(particle);

                if (value != null) {
                    values.add(parseParticle(particle));
                }
            });

            return new XsdGroupValue(minOccurs, maxOccurs, kind, values);
        }

        return null;
    }

    private XsdType parseType(XSType xs) {
        return parseType(xs.getName(), xs);
    }

    private XsdType parseType(String name, XSType xs) {
        return scope.declare(
                xs.getTargetNamespace(),
                name,
                xs.getBaseType().getTargetNamespace(),
                xs.getBaseType().getName());
    }

    private String parseString(XmlString value) {
        return value != null
                ? value.value
                : null;
    }
}
