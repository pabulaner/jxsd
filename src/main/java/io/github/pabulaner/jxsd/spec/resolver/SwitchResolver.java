package io.github.pabulaner.jxsd.spec.resolver;

import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.util.Pair;

import java.util.List;
import java.util.function.Predicate;

public class SwitchResolver implements Resolver {

    private final List<Pair<Predicate<JavaType>, Resolver>> resolvers;

    private final Resolver defaultResolver;

    public SwitchResolver(List<Pair<Predicate<JavaType>, Resolver>> resolvers, Resolver defaultResolver) {
        this.resolvers = resolvers;
        this.defaultResolver = defaultResolver;
    }

    @Override
    public JavaType resolve(JavaType original, JavaType type) {
        for (Pair<Predicate<JavaType>, Resolver> resolver : resolvers) {
            if (resolver.first().test(original)) {
                return resolver.second().resolve(original, type);
            }
        }

        return defaultResolver.resolve(original, type);
    }
}
