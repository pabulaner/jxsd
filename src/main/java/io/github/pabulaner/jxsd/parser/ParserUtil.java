package io.github.pabulaner.jxsd.parser;

import com.sun.xml.xsom.XSSimpleType;
import com.sun.xml.xsom.XSType;
import com.sun.xml.xsom.XmlString;
import io.github.pabulaner.jxsd.parser.model.Name;

public final class ParserUtil {

    private ParserUtil() {
    }

    public static Name toName(XSType value) {
        String name = value.getName();

        if (name == null) {
            return null;
        }

        if (value.isSimpleType()) {
            XSSimpleType simple = value.asSimpleType();

            if (simple.isPrimitive()) {
                return new Name(xsdPrimitiveToJavaType(simple.getName()));
            }
        }

        return new Name(name);
    }

    public static Name toName(String value) {
        return value != null
                ? new Name(value)
                : null;
    }

    public static Name toName(XmlString xml) {
        return xml != null
                ? toName(xml.value)
                : null;
    }

    private static String xsdPrimitiveToJavaType(String primitive) {
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
