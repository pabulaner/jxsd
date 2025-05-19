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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleParser extends Parser<XSSimpleType> {

    private final List<Model> models = new ArrayList<>();

    public SimpleParser(ParserMap map) {
        super(map);
    }

    @Override
    public Result parse(XSSimpleType xs) {
        Name name = ParserUtil.toName(xs);
        Model model = null;

        if (xs.isPrimitive()) {
            model = new PrimitiveModel(name, null, null);
        }

        if (xs.isRestriction()) {
            XSRestrictionSimpleType restriction = xs.asRestriction();
            Collection<RestrictionModel> restrictions = parseRestrictions(restriction);
            Collection<Name> enums = parseEnums(restriction);

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
            Collection<Name> types = new ArrayList<>();

            union.forEach(type -> types.add(ParserUtil.toName(type)));
            model = new UnionModel(name, types);
        }

        models.add(model);
        return new Result(model);
    }



    private Name parseList(XSType xs) {
        return new Name("java.util.ArrayList<" + ParserUtil.toName(xs) + ">");
    }

    private Collection<RestrictionModel> parseRestrictions(XSRestrictionSimpleType xs) {
        return xs.getDeclaredFacets()
                .stream()
                .map(facet -> new RestrictionModel(
                        ParserUtil.toName(facet.getName()),
                        ParserUtil.toName(facet.getValue())))
                .collect(Collectors.toList());
    }

    private Collection<Name> parseEnums(XSRestrictionSimpleType xs) {
        return xs.getDeclaredFacets()
                .stream()
                .filter(facet -> "enumeration".equals(facet.getName()))
                .map(facet -> facet.getValue().value)
                .map(ParserUtil::toName)
                .collect(Collectors.toList());
    }
}
