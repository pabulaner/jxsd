package io.github.pabulaner.jxsd.out.model;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.out.OutParser;

public abstract class ModelParser<TClass extends JavaClass> extends OutParser<TClass> {

    protected static final String IS = "is";

    protected static final String GET = "get";

    protected static final String TYPE = "type";

    protected static final String VALUE = "value";
    
    public ModelParser() {
        this(false);
    }

    protected ModelParser(boolean isEnum) {
        super(isEnum, JavaName::toModel);
    }
}
