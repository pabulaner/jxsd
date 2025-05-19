package io.github.pabulaner.jxsd.parser;

import com.sun.xml.xsom.XSListSimpleType;
import com.sun.xml.xsom.XSRestrictionSimpleType;
import com.sun.xml.xsom.XSSimpleType;
import com.sun.xml.xsom.XSType;
import com.sun.xml.xsom.XSUnionSimpleType;
import io.github.pabulaner.jxsd.parser.model.EnumModel;
import io.github.pabulaner.jxsd.parser.model.Model;
import io.github.pabulaner.jxsd.parser.model.PrimitiveModel;
import io.github.pabulaner.jxsd.parser.model.Name;
import io.github.pabulaner.jxsd.parser.model.RestrictionModel;
import io.github.pabulaner.jxsd.parser.model.UnionModel;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleParser extends Parser<XSSimpleType> {

    private final List<Model> models = new ArrayList<>();

    public SimpleParser(ParserMap map) {
        super(map);
    }

    @Override
    public Result parse(XSSimpleType xs) {
        Name name = parseName(xs);
        Model model = null;

        if (xs.isPrimitive()) {
            model = new PrimitiveModel(parseName(xs), null, null);
        }

        if (xs.isRestriction()) {
            XSRestrictionSimpleType restriction = xs.asRestriction();
            List<RestrictionModel> restrictions = parseRestrictions(restriction);
            List<Name> enums = parseEnums(restriction);

            if (enums.isEmpty()) {
                model = new PrimitiveModel(name, null, restrictions);
            } else {
                model = new EnumModel(name, enums);
            }
        }

        if (xs.isList()) {
            XSListSimpleType list = xs.asList();
            model = new PrimitiveModel(name, parseList(list.getItemType()), null);
        }

        if (xs.isUnion()) {
            XSUnionSimpleType union = xs.asUnion();
            List<Name> types = new ArrayList<>();

            union.forEach(type -> types.add(parseName(type)));
            model = new UnionModel(name, types);
        }

        models.add(model);
        return new Result(model);
    }

    private Name parseName(XSType xs) {
        String name = xs.getName();

        if (name == null) {
            return null;
        }

        if (xs.isSimpleType()) {
            XSSimpleType simple = xs.asSimpleType();

            if (simple.isPrimitive()) {
                return new Name(xsdPrimitiveToJavaType(simple.getName()));
            }
        }

        return new Name(name);
    }

    private Name parseList(XSType xs) {
        return new Name("java.util.ArrayList<" + parseName(xs) + ">");
    }

    private List<RestrictionModel> parseRestrictions(XSRestrictionSimpleType xs) {
        return xs.getDeclaredFacets()
                .stream()
                .map(facet -> new RestrictionModel(
                        new Name(facet.getName()),
                        facet.getValue() != null ? new Name(facet.getValue().value) : null))
                .collect(Collectors.toList());
    }

    private List<Name> parseEnums(XSRestrictionSimpleType xs) {
        return xs.getDeclaredFacets()
                .stream()
                .filter(facet -> "enumeration".equals(facet.getName()))
                .map(facet -> facet.getValue().value)
                .map(Name::new)
                .collect(Collectors.toList());
    }

    private String xsdPrimitiveToJavaType(String primitive) {
        switch (primitive) {
            case "string":
            case "ID":
            case "IDREF":
            case "NCName":
            case "NMTOKEN":
            case "Name":
            case "token":
            case "normalizedString":
            case "language": return "String";
            case "boolean": return "Boolean";
            case "byte": return "Byte";
            case "short":
            case "unsignedByte": return "Short";
            case "int":
            case "integer":
            case "unsignedShort": return "Integer";
            case "long":
            case "unsignedInt": return "Long";
            case "float": return "Float";
            case "double": return "Double";
            case "decimal": return "java.math.BigDecimal";
            case "dateTime":
            case "time": return "java.time.LocalDateTime";
            case "duration": return "java.time.Duration";
            case "date":
            case "gDay":
            case "gMonth":
            case "gYear":
            case "gMonthDay":
            case "gYearMonth": return "java.time.LocalDate";
            case "unsignedLong":
            case "positiveInteger":
            case "nonNegativeInteger":
            case "negativeInteger":
            case "nonPositiveInteger": return "java.math.BigInteger";
            case "base64Binary":
            case "hexBinary": return "Byte[]";
            case "anyURI": return "java.net.URI";
            case "QName":
            case "NOTATION": return "javax.xml.namespace.QName";
            case "anySimpleType": return null;
        }

        throw new IllegalArgumentException("Unknown primitive '" + primitive + "'");
    }
}
