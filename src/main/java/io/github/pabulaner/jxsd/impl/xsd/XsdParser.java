package io.github.pabulaner.jxsd.impl.xsd;

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
import io.github.pabulaner.jxsd.api.xsd.IXsdComplexType;
import io.github.pabulaner.jxsd.api.xsd.IXsdGroupValue;
import io.github.pabulaner.jxsd.api.xsd.IXsdModel;
import io.github.pabulaner.jxsd.api.xsd.IXsdRestriction;
import io.github.pabulaner.jxsd.api.xsd.IXsdSimpleType;
import io.github.pabulaner.jxsd.api.xsd.IXsdType;
import io.github.pabulaner.jxsd.api.xsd.IXsdValue;
import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParserFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class XsdParser {

    public List<IXsdModel> parse(URL url) throws SAXException {
        XSOMParser parser = new XSOMParser(SAXParserFactory.newInstance());
        parser.parse(url);

        XSSchemaSet set = parser.getResult();
        List<IXsdModel> result = new ArrayList<>();

        set.getSchemas().forEach(schema -> schema.getTypes()
                .values()
                .stream()
                .map(xs -> xs.isSimpleType()
                        ? parseSimpleType(xs.asSimpleType())
                        : parseComplexType(xs.asComplexType()))
                .forEach(result::add));

        return result;
    }

    private IXsdType parseType(XSType xs) {
        return new XsdTypeImpl(xs.getName(), xs.getBaseType().getName());
    }

    private IXsdSimpleType parseSimpleType(XSSimpleType xs) {
        IXsdType type = parseType(xs);

        if (xs.isPrimitive()) {
            return new XsdSimpleTypeImpl.XsdPrimitiveTypeImpl(type);
        }

        if (xs.isRestriction()) {
            XSRestrictionSimpleType restriction = xs.asRestriction();
            List<IXsdRestriction> restrictions = restriction.getDeclaredFacets()
                    .stream()
                    .map(facet -> new XsdRestrictionImpl(
                            facet.getName(),
                            parseString(facet.getValue())))
                    .collect(Collectors.toList());

            return new XsdSimpleTypeImpl.XsdRestrictionTypeImpl(type, restrictions);
        }

        if (xs.isList()) {
            XSListSimpleType list = xs.asList();
            IXsdType itemType = parseType(list.getItemType());

            return new XsdSimpleTypeImpl.XsdListTypeImpl(type, itemType);
        }

        if (xs.isUnion()) {
            XSUnionSimpleType union = xs.asUnion();
            List<IXsdType> types = new ArrayList<>();

            union.forEach(xsType -> types.add(parseType(xsType)));
            return new XsdSimpleTypeImpl.XsdUnionTypeImpl(type, types);
        }

        throw new IllegalStateException("Unreachable");
    }

    private IXsdComplexType parseComplexType(XSComplexType xs) {
        IXsdType type = parseType(xs);

        if (type.name().equals("test")) {
            System.out.println("test");
        }

        List<IXsdValue> values = xs.getAttributeUses()
                .stream()
                .map(attr -> {
                    XSAttributeDecl decl = attr.getDecl();
                    IXsdType attrType = parseType(decl.getType());

                    return new XsdElementValueImpl(1, 1,
                            attrType,
                            decl.getName(),
                            parseString(attr.getDefaultValue()));
                })
                .collect(Collectors.toList());

        XSContentType content = xs.getContentType();

        if (content != null) {
            XSSimpleType simple = content.asSimpleType();
            XSParticle particle = content.asParticle();

            if (simple != null) {
                // empty, as simple type should already be the base type
            }

            if (particle != null) {
                IXsdValue value = parseParticle(particle);

                if (value != null) {
                    values.add(value);
                }
            }
        }

        return new XsdComplexTypeImpl(type, values);
    }

    private IXsdValue parseParticle(XSParticle xs) {
        XSTerm term = xs.getTerm();
        int minOccurs = xs.getMinOccurs().intValue();
        int maxOccurs = xs.getMaxOccurs().intValue();

        if (minOccurs == -1) minOccurs = Integer.MAX_VALUE;
        if (maxOccurs == -1) maxOccurs = Integer.MAX_VALUE;

        if (term.isElementDecl()) {
            XSElementDecl element = term.asElementDecl();
            IXsdType type = parseType(element.getType());
            return new XsdElementValueImpl(
                    minOccurs,
                    maxOccurs,
                    type,
                    element.getName(),
                    parseString(element.getDefaultValue()));
        }

        if (term.isModelGroup()) {
            XSModelGroup group = term.asModelGroup();
            IXsdGroupValue.Kind kind = switch (group.getCompositor()) {
                case SEQUENCE, ALL -> IXsdGroupValue.Kind.SEQUENCE;
                case CHOICE -> IXsdGroupValue.Kind.UNION;
            };

            List<IXsdValue> values = new ArrayList<>();

            group.forEach(particle -> {
                IXsdValue value = parseParticle(particle);

                if (value != null) {
                    values.add(parseParticle(particle));
                }
            });

            return new XsdGroupValueImpl(minOccurs, maxOccurs, kind, values);
        }

        return null;
    }

    private String parseString(XmlString value) {
        return value != null
                ? value.value
                : null;
    }
}
