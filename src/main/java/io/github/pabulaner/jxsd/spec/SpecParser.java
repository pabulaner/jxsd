package io.github.pabulaner.jxsd.spec;

import io.github.pabulaner.jxsd.java.JavaClass;

public interface SpecParser<TSpec extends JavaClass> {

    void parse(SpecContext<TSpec> ctx);
}
