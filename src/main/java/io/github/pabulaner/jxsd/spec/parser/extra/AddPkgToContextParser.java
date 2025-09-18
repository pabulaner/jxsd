package io.github.pabulaner.jxsd.spec.parser.extra;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;

public class AddPkgToContextParser implements SpecParser {

    private final Resolver resolver;

    public AddPkgToContextParser(Resolver resolver) {
        this.resolver = resolver;
    }

    @Override
    public void parse(SpecContext ctx) {
        JavaClass spec = ctx.get(SpecKey.SPEC);
        JavaType specType = resolver.resolve(spec.getType());

        ctx.set(SpecKey.PKG, specType.getPkg());
        ctx.next();
    }
}
