package io.github.pabulaner.jxsd.xsd;

import com.sun.xml.xsom.XSAnnotation;
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
import com.sun.xml.xsom.util.DomAnnotationParserFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParserFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class XsdParser {

    public static final String ANY_TYPE = "anyType";

    public static final String SIMPLE_TYPE = "simpleType";

    public static final String ANY_SIMPLE_TYPE = "anySimpleType";

    private record Pair(XsdType type, XsdStruct struct) {
    }

    private XsdScope scope;

    private final Stack<String> anonymous;

    public XsdParser() {
        scope = null;
        anonymous = new Stack<>();
    }

    public XsdResult parse(URL url) throws SAXException {
        scope = new XsdScope();

        XSOMParser parser = new XSOMParser(SAXParserFactory.newInstance());
        parser.setAnnotationParser(new DomAnnotationParserFactory());
        parser.parse(url);

        XSSchemaSet set = parser.getResult();
        List<XsdStruct> structs = new ArrayList<>();

        set.getSchemas().forEach(schema -> {
//            schema.getModelGroupDecls().forEach((key, value) -> {
//                XsdType type = new XsdType(schema.getTargetNamespace(), key, null, null);
//                List<XsdValue> values = Arrays.stream(value.getModelGroup().getChildren())
//                        .map(this::parseParticle)
//                        .toList();
//
//                structs.add(new XsdComplexStruct(type, values));
//            });

            schema.getTypes()
                    .values()
                    .stream()
                    .map(this::parse)
                    .filter(xs -> !ANY_TYPE.equals(xs.type().name()))
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

    private void print(Node node, String tabs) {
        System.out.println(tabs + node.getLocalName() + ": " + ((node.getAttributes() != null) ? node.getAttributes().getNamedItem("name") : null));
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node child = node.getChildNodes().item(i);
            print(child, tabs + "\t");

        }
    }

    private XsdComplexStruct parseComplexType(XSComplexType xs) {
        XsdType type = parseType(xs);

        List<XsdValue> values = xs.getAttributeUses()
                .stream()
                .map(attr -> {
                    XSAttributeDecl decl = attr.getDecl();
                    String name = decl.getName();
                    Pair pair = parseAnonymous(name, decl.getType());

                    return new XsdElementValue(name,
                            1, 1,
                            pair.struct,
                            pair.type,
                            parseString(attr.getDefaultValue()));
                })
                .collect(Collectors.toList());

        XSContentType content = xs.getContentType();

        if (content != null) {
            XSParticle particle = content.asParticle();

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
                if (group.kind() == XsdGroupValue.Kind.SEQUENCE || group.values().size() == 1) {
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
            String name = element.getName();
            Pair pair = parseAnonymous(name, element.getType());

            return new XsdElementValue(
                    name,
                    minOccurs,
                    maxOccurs,
                    pair.struct,
                    pair.type,
                    parseString(element.getDefaultValue()));
        }

        if (term.isModelGroup() || term.isModelGroupDecl()) {
            String name = term.isModelGroupDecl()
                    ? term.asModelGroupDecl().getName()
                    : null;
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

            return new XsdGroupValue(name, minOccurs, maxOccurs, kind, values);
        }

        return null;
    }

    private XsdType parseType(XSType xs) {
        return parseType(xs.getName(), xs);
    }

    private XsdType parseType(String name, XSType xs) {
        if (name == null) {
            name = anonymous.pop();
        }

        XSType base = xs.getBaseType();

        return scope.declare(
                xs.getTargetNamespace(),
                parseRename(xs, name),
                xs.getBaseType().getTargetNamespace(),
                parseRename(base, base.getName()));
    }

    private String parseRename(XSType xs, String name) {
        XSAnnotation annotation = xs.getAnnotation();

        if (annotation != null) {
            Element annotationElem = (Element) annotation.getAnnotation();
            String rename = parseRename(annotationElem.getChildNodes());

            if (rename != null) {
                return rename;
            }
        }

        return name;
    }

    private String parseRename(NodeList nodes) {
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);

            if (node != null) {
                if ("class".equals(node.getLocalName())) {
                    return node.getAttributes()
                            .getNamedItem("name")
                            .getNodeValue();
                }

                String result = parseRename(node.getChildNodes());

                if (result != null) {
                    return result;
                }
            }
        }

        return null;
    }

    private Pair parseAnonymous(String name, XSType type) {
        String typeName = type.getName();

        if (typeName == null) {
            anonymous.push(name);
            return new Pair(parseType(name, type), parse(type));
        } else {
            return new Pair(parseType(type), null);
        }
    }

    private String parseString(XmlString value) {
        return value != null
                ? value.value
                : null;
    }
}
