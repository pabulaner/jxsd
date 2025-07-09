package io.github.pabulaner.jxsd.java;

import java.util.List;

public class JavaInterface extends JavaClass {

    public static class Method {

        private final JavaName name;

        private final JavaType type;

        private final boolean wildcard;

        public Method(JavaName name, JavaType type, boolean wildcard) {
            this.name = name;
            this.type = type;
            this.wildcard = wildcard;
        }

        public JavaName getName() {
            return name;
        }

        public JavaType getType() {
            return type;
        }

        public boolean isWildcard() {
            return wildcard;
        }
    }

    private final List<Method> methods;

    public JavaInterface(JavaType type, List<Method> methods) {
        super(type);
        this.methods = methods;
    }

    public List<Method> getMethods() {
        return methods;
    }
}
