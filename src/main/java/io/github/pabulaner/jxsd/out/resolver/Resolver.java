package io.github.pabulaner.jxsd.out.resolver;

import io.github.pabulaner.jxsd.java.JavaType;

public interface Resolver {

    static Resolver combine(Resolver... resolvers) {
        return new Resolver() {
            @Override
            public JavaType resolve(JavaType type) {
                for (Resolver resolver : resolvers) {
                    type = resolver.resolve(type);
                }

                return type;
            }

            @Override
            public String resolve(JavaType type, String name) {
                for (Resolver resolver : resolvers) {
                    name = resolver.resolve(type, name);
                }

                return name;
            }
        };
    }

    JavaType resolve(JavaType type);

    default String resolve(JavaType type, String name) {
        return name;
    }
}
