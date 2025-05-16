package io.github.pabulaner.jxsd.input;

import com.sun.xml.xsom.XSComplexType;
import com.sun.xml.xsom.XSRestrictionSimpleType;
import com.sun.xml.xsom.XSSchemaSet;
import com.sun.xml.xsom.XSSimpleType;
import com.sun.xml.xsom.XSType;
import com.sun.xml.xsom.parser.XSOMParser;
import io.github.pabulaner.jxsd.api.input.IInputParser;
import io.github.pabulaner.jxsd.api.model.IClass;
import io.github.pabulaner.jxsd.api.model.IEnum;
import io.github.pabulaner.jxsd.api.model.IName;
import io.github.pabulaner.jxsd.api.model.IPackage;
import io.github.pabulaner.jxsd.api.model.IType;
import io.github.pabulaner.jxsd.model.EnumModel;
import io.github.pabulaner.jxsd.model.NameModel;
import io.github.pabulaner.jxsd.model.PackageModel;
import io.github.pabulaner.jxsd.model.TypeModel;
import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParserFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class InputParser implements IInputParser {

    private final Map<String, IType> types;

    public InputParser() {
        this.types = new HashMap<>();
    }

    @Override
    public IPackage parse(URL url) throws SAXException {
        XSOMParser parser = new XSOMParser(SAXParserFactory.newInstance());
        parser.parse(url);

        XSSchemaSet set = parser.getResult();
        types.clear();

        return parseSet(set);
    }

    private IPackage parseSet(XSSchemaSet set) {
        IType type = new TypeModel(new NameModel(""), null, null);
        List<IClass> result = new ArrayList<>();

        set.getSchemas().forEach(schema -> {
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
                return new EnumModel(getType(type), null, values);
            }
        }

        return null;
    }

    private IClass parseClass(XSComplexType type) {

    }

    private IType getType(XSType type) {
        if (type.getName() == null) {
            return null;
        }

        IType result = types.get(type.getName());

        if (result != null) {
            return result;
        }

        IType base = getType(type.getBaseType());
    }
}
