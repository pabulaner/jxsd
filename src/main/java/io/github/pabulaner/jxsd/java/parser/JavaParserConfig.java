package io.github.pabulaner.jxsd.java.parser;

import io.github.pabulaner.jxsd.xsd.XsdScope;

public class JavaParserConfig {

    private String base;

    private String type;

    private String template;

    private XsdScope scope;

    public JavaParserConfig() {
        base = null;
        type = null;
        template = null;
        scope = null;
    }

    public String getBase() {
        return base;
    }

    public JavaParserConfig setBase(String base) {
        this.base = base;
        return this;
    }

    public String getType() {
        return type;
    }

    public JavaParserConfig setType(String type) {
        this.type = type;
        return this;
    }

    public String getTemplate() {
        return template;
    }

    public JavaParserConfig setTemplate(String template) {
        this.template = template;
        return this;
    }

    public XsdScope getScope() {
        return scope;
    }

    public JavaParserConfig setScope(XsdScope scope) {
        this.scope = scope;
        return this;
    }
}
