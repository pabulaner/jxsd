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
import io.github.pabulaner.jxsd.api.xsd.IComplexType;
import io.github.pabulaner.jxsd.api.xsd.IGroupValue;
import io.github.pabulaner.jxsd.api.xsd.IModel;
import io.github.pabulaner.jxsd.api.xsd.IRestriction;
import io.github.pabulaner.jxsd.api.xsd.ISimpleType;
import io.github.pabulaner.jxsd.api.xsd.IType;
import io.github.pabulaner.jxsd.api.xsd.IValue;
import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParserFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class XsdParser {

    public Map<String, IModel> parse(URL url) throws SAXException {
        XSOMParser parser = new XSOMParser(SAXParserFactory.newInstance());
        parser.parse(url);

        XSSchemaSet set = parser.getResult();
        Map<String, IModel> result = new HashMap<>();

        set.getSchemas().forEach(schema -> schema.getTypes()
                .values()
                .stream()
                .map(xs -> xs.isSimpleType()
                        ? parseSimpleType(xs.asSimpleType())
                        : parseComplexType(xs.asComplexType()))
                .forEach(model -> result.put(model.type().name(), model)));

        return result;
    }

    private IType parseType(XSType xs) {
        return new TypeImpl(xs.getName(), xs.getBaseType().getName());
    }

    private ISimpleType parseSimpleType(XSSimpleType xs) {
        IType type = parseType(xs);

        if (xs.isPrimitive()) {
            return new SimpleTypeImpl.PrimitiveTypeImpl(type);
        }

        if (xs.isRestriction()) {
            XSRestrictionSimpleType restriction = xs.asRestriction();
            List<IRestriction> restrictions = restriction.getDeclaredFacets()
                    .stream()
                    .map(facet -> new RestrictionImpl(
                            facet.getName(),
                            parseString(facet.getValue())))
                    .collect(Collectors.toList());

            return new SimpleTypeImpl.RestrictionTypeImpl(type, restrictions);
        }

        if (xs.isList()) {
            XSListSimpleType list = xs.asList();
            IType itemType = parseType(list.getItemType());

            return new SimpleTypeImpl.ListTypeImpl(type, itemType);
        }

        if (xs.isUnion()) {
            XSUnionSimpleType union = xs.asUnion();
            List<IType> types = new ArrayList<>();

            union.forEach(xsType -> types.add(parseType(xsType)));
            return new SimpleTypeImpl.UnionTypeImpl(type, types);
        }

        throw new IllegalStateException("Unreachable");
    }

    private IComplexType parseComplexType(XSComplexType xs) {
        IType type = parseType(xs);

        if (type.name().equals("test")) {
            System.out.println("test");
        }

        List<IValue> values = xs.getAttributeUses()
                .stream()
                .map(attr -> {
                    XSAttributeDecl decl = attr.getDecl();
                    IType attrType = parseType(decl.getType());

                    return new ElementValueImpl(1, 1,
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
                IValue value = parseParticle(particle);

                if (value != null) {
                    values.add(value);
                }
            }
        }

        return new ComplexTypeImpl(type, values);
    }

    private IValue parseParticle(XSParticle xs) {
        XSTerm term = xs.getTerm();
        int minOccurs = xs.getMinOccurs().intValue();
        int maxOccurs = xs.getMaxOccurs().intValue();

        if (term.isElementDecl()) {
            XSElementDecl element = term.asElementDecl();
            IType type = parseType(element.getType());
            return new ElementValueImpl(
                    minOccurs,
                    maxOccurs,
                    type,
                    element.getName(),
                    parseString(element.getDefaultValue()));
        }

        if (term.isModelGroup()) {
            XSModelGroup group = term.asModelGroup();
            IGroupValue.Kind kind = switch (group.getCompositor()) {
                case SEQUENCE, ALL -> IGroupValue.Kind.SEQUENCE;
                case CHOICE -> IGroupValue.Kind.UNION;
            };

            List<IValue> values = new ArrayList<>();

            group.forEach(particle -> {
                IValue value = parseParticle(particle);

                if (value != null) {
                    values.add(parseParticle(particle));
                }
            });

            return new GroupValueImpl(minOccurs, maxOccurs, kind, values);
        }

        return null;
    }

    private String parseString(XmlString value) {
        return value != null
                ? value.value
                : null;
    }
}
