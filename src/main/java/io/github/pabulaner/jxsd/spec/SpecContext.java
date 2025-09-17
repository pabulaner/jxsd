package io.github.pabulaner.jxsd.spec;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

public final class SpecContext<TSpec extends JavaClass> {

    private TypeSpec.Builder builder;

    private JavaScope scope;

    private TSpec spec;

    private Resolver resolver;

    public SpecContext() {
        // empty
    }

    public TypeSpec.Builder getBuilder() {
        return builder;
    }

    public void setBuilder(TypeSpec.Builder builder) {
        this.builder = builder;
    }

    public JavaScope getScope() {
        return scope;
    }

    public void setScope(JavaScope scope) {
        this.scope = scope;
    }

    public TSpec getSpec() {
        return spec;
    }

    public void setSpec(TSpec spec) {
        this.spec = spec;
    }

    public Resolver getResolver() {
        return resolver;
    }

    public void setResolver(Resolver resolver) {
        this.resolver = resolver;
    }
}
