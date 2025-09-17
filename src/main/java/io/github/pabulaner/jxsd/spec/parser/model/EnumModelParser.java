package io.github.pabulaner.jxsd.spec.parser.model;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.util.Name;

public class EnumModelParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaEnum spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder builder = ctx.get(SpecKey.BUILDER);

        spec.getValues()
                .stream()
                .map(value -> new Name(value).toEnum())
                .forEach(builder::addEnumConstant);

        ctx.next();
    }
}
