package io.github.pabulaner.jxsd.out.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.ParserUtil;
import io.github.pabulaner.jxsd.out.RestrictionUtil;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class RestrictionModelParser extends BaseParser<JavaRestriction> {

    public RestrictionModelParser(ParserGroup group) {
        super(group);
    }

    @Override
    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaRestriction clazz) {
        JavaScope scope = getGroup().getMap().getScope();
        JavaType primitive = RestrictionUtil.findPrimitive(scope, clazz.primitive());
        JavaType type = RestrictionUtil.findPrimitive(scope, clazz.type());

        if (primitive.equals(type)) {
            return builder
                    .superclass(ParserUtil.convertType(clazz.parent(), getResolver()))
                    .addMethod(MethodSpec.constructorBuilder()
                            .addModifiers(Modifier.PUBLIC)
                            .addParameter(ParserUtil.convertPrimitive(primitive), VALUE)
                            .addStatement("$N($N)", SUPER, VALUE)
                            .build());
        } else {
            return new PrimitiveModelParser(getGroup()).parse(builder, new JavaPrimitive(type));
        }
    }
}
