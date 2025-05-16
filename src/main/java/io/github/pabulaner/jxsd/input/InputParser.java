package io.github.pabulaner.jxsd.input;

import com.sun.xml.xsom.XSAttributeDecl;
import com.sun.xml.xsom.XSAttributeUse;
import com.sun.xml.xsom.XSComplexType;
import com.sun.xml.xsom.XSElementDecl;
import com.sun.xml.xsom.XSFacet;
import com.sun.xml.xsom.XSModelGroup;
import com.sun.xml.xsom.XSParticle;
import com.sun.xml.xsom.XSRestrictionSimpleType;
import com.sun.xml.xsom.XSSchemaSet;
import com.sun.xml.xsom.XSSimpleType;
import com.sun.xml.xsom.XSTerm;
import com.sun.xml.xsom.XSType;
import com.sun.xml.xsom.parser.XSOMParser;
import io.github.pabulaner.jxsd.api.input.IInputParser;
import io.github.pabulaner.jxsd.api.model.IClass;
import io.github.pabulaner.jxsd.api.model.IEnum;
import io.github.pabulaner.jxsd.api.model.IName;
import io.github.pabulaner.jxsd.api.model.IPackage;
import io.github.pabulaner.jxsd.api.model.IType;
import io.github.pabulaner.jxsd.input.value.AttributeValue;
import io.github.pabulaner.jxsd.input.value.GroupValue;
import io.github.pabulaner.jxsd.input.type.ListType;
import io.github.pabulaner.jxsd.input.type.ObjectType;
import io.github.pabulaner.jxsd.input.type.PrimitiveType;
import io.github.pabulaner.jxsd.input.type.RestrictionType;
import io.github.pabulaner.jxsd.input.type.Restriction;
import io.github.pabulaner.jxsd.input.type.UnionType;
import io.github.pabulaner.jxsd.input.type.ValueType;
import io.github.pabulaner.jxsd.input.value.ElementValue;
import io.github.pabulaner.jxsd.input.value.Value;
import io.github.pabulaner.jxsd.model.NameModel;
import io.github.pabulaner.jxsd.model.PackageModel;
import io.github.pabulaner.jxsd.model.TypeModel;
import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParserFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class InputParser implements IInputParser {

    private static final String ANY_SIMPLE_TYPE = "anySimpleType";

    private final Scope scope;

    public InputParser() {
        scope = new Scope();
    }

    @Override
    public IPackage parse(URL url) throws SAXException {
        XSOMParser parser = new XSOMParser(SAXParserFactory.newInstance());
        parser.parse(url);

        XSSchemaSet set = parser.getResult();

        return parseSet(set);
    }

    private IPackage parseSet(XSSchemaSet set) {
        IType type = new TypeModel(new NameModel(""), null, null);
        List<IClass> result = new ArrayList<>();

        set.getSchemas().forEach(schema -> {
            schema.getSimpleTypes().values().forEach(this::parseType);
            schema.getComplexTypes().values().forEach(this::parseType);
            List<IEnum> enums = schema.getSimpleTypes()
                    .values()
                    .stream()
                    .map(this::parseEnum)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());

            List<IClass> classes = schema.getComplexTypes()
                    .values()
                    .stream()
                    .map(this::parseClass)
                    .collect(Collectors.toList());

            result.addAll(enums);
            result.addAll(classes);
        });

        return new PackageModel(type, null, result);
    }

    private ValueType parseType(XSType type) {
        String name = type.getName();
        ValueType result = scope.getType(name);

        // check if type has already been cast
        if (result != null) {
            return result;
        }

        XSType baseType = type.getBaseType();

        // check if type is anonymous
        if (type.isLocal() || type == baseType) {
            return null;
        }

        // check if type is any type
        if (type.getName() != null && type.getName().equals(ANY_SIMPLE_TYPE)) {
            return null;
        }

        // get base type, if any
        ValueType base = parseType(baseType);

        // check if simple or complex type
        if (type.isSimpleType()) {
            result = parseSimple(type.asSimpleType(), base);
        } else {
            result = parseComplex(type.asComplexType(), base);
        }

        scope.addType(result);
        return result;
    }

    private ValueType parseSimple(XSSimpleType type, ValueType base) {
        String name = type.getName();
        XSSimpleType simpleType = type.asSimpleType();

        // check if primitive type
        if (simpleType.isPrimitive()) {
            return new PrimitiveType(name);
        }

        // check if restriction type
        if (simpleType.isRestriction()) {
            List<Restriction> restrictions = simpleType.asRestriction()
                    .getDeclaredFacets()
                    .stream()
                    .map(this::parseRestriction)
                    .collect(Collectors.toList());

            return new RestrictionType(name, base, restrictions);
        }

        // check if list type
        if (simpleType.isList()) {
            ValueType itemType = parseType(simpleType.asList().getItemType());
            return new ListType(name, base, itemType);
        }

        // check if union type
        if (simpleType.isUnion()) {
            List<ValueType> types = new ArrayList<>();
            simpleType.asUnion().forEach(value -> types.add(parseType(value)));

            return new UnionType(name, base, types);
        }

        throw new IllegalStateException();
    }

    private ValueType parseComplex(XSComplexType type, ValueType base) {
        String name = type.getName();
        XSComplexType complexType = type.asComplexType();
        XSParticle particle = type.getContentType().asParticle();

        List<AttributeValue> attributes = complexType.getAttributeUses()
                .stream()
                .map(XSAttributeUse::getDecl)
                .map(decl -> {
                    ValueType declType = parseType(decl.getType());
                    String declName = decl.getName();
                    String declDefaultValue = decl.getDefaultValue().value;
                    String declFixedValue = decl.getFixedValue().value;

                    return new AttributeValue(declType, declName, declDefaultValue, declFixedValue);
                })
                .collect(Collectors.toList());

        return new ObjectType(name, base, attributes, parseValue(particle));
    }

    private Restriction parseRestriction(XSFacet facet) {
        String name = facet.getName();
        String value = facet.getValue().value;
        Restriction.Kind kind;

        switch (name) {
            case "enumeration": kind = Restriction.Kind.ENUM; break;
            case "fractionDigits": kind = Restriction.Kind.FRACTION_DIGITS; break;
            case "length": kind = Restriction.Kind.LENGTH; break;
            case "maxExclusive": kind = Restriction.Kind.MAX_EXCLUSIVE; break;
            case "maxInclusive": kind = Restriction.Kind.MAX_INCLUSIVE; break;
            case "maxLength": kind = Restriction.Kind.MAX_LENGTH; break;
            case "minExclusive": kind = Restriction.Kind.MIN_EXCLUSIVE; break;
            case "minInclusive": kind = Restriction.Kind.MIN_INCLUSIVE; break;
            case "minLength": kind = Restriction.Kind.MIN_LENGTH; break;
            case "pattern": kind = Restriction.Kind.PATTERN; break;
            case "whiteSpace": kind = Restriction.Kind.WHITE_SPACE; break;
            default: throw new IllegalArgumentException("Unsupported restriction '" + name + "'");
        }

        return new Restriction(kind, value);
    }

    private Value parseValue(XSParticle particle) {
        int minOccurs = particle.getMinOccurs().intValue();
        int maxOccurs = particle.getMaxOccurs().intValue();
        XSTerm term = particle.getTerm();

        if (term.isModelGroup()) {
            XSModelGroup group = term.asModelGroup();
            GroupValue.Compositor compositor;

            switch (group.getCompositor()) {
                case SEQUENCE: compositor = GroupValue.Compositor.SEQUENCE; break;
                case CHOICE: compositor = GroupValue.Compositor.CHOICE; break;
                case ALL: compositor = GroupValue.Compositor.ALL; break;
                default: throw new IllegalArgumentException("Unsupported compositor '" + group.getCompositor() + "'");
            }

            List<Value> children = new ArrayList<>();
            group.forEach(value -> children.add(parseValue(value)));

            return new GroupValue(minOccurs, maxOccurs, compositor, children);
        } else {
            XSElementDecl element = term.asElementDecl();
            ValueType type = parseType(term.asElementDecl().getType());

            return new ElementValue(minOccurs, maxOccurs, type, element.getName());
        }
    }

    private IEnum parseEnum(XSSimpleType type) {
        if (type.isRestriction()) {
            XSRestrictionSimpleType restriction = type.asRestriction();
            List<IName> values = restriction.getDeclaredFacets()
                    .stream()
                    .filter(facet -> facet.getName().equals("enumeration"))
                    .map(facet -> facet.getValue().value)
                    .map(NameModel::new)
                    .collect(Collectors.toList());

            if (!values.isEmpty()) {
                // return new EnumModel(getType(type), null, values);
            }
        }

        return null;
    }

    private IClass parseClass(XSComplexType type) {
        return null;
    }
}
