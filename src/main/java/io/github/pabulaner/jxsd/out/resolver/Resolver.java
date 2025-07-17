package io.github.pabulaner.jxsd.out.resolver;

import io.github.pabulaner.jxsd.java.JavaType;

public interface Resolver {

    static Resolver combine(Resolver... resolvers) {
        return type -> {
            for (Resolver resolver : resolvers) {
                type = resolver.resolve(type);
            }

            return type;
        };
    }

    JavaType resolve(JavaType type);
}
