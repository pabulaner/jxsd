package io.github.pabulaner.jxsd.gen.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.gen.util.RestrictionUtil;
import io.github.pabulaner.jxsd.gen.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class RestrictionModelParser extends ModelParser<JavaRestriction> {

    public RestrictionModelParser(ParserGroup group) {
        super(group);
    }

    @Override
    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaRestriction clazz) {
        super.parse(builder, clazz);

        JavaScope scope = getGroup().getMap().getScope();
        JavaType primitive = RestrictionUtil.findPrimitive(scope, clazz.getPrimitive());
        JavaType type = RestrictionUtil.findPrimitive(scope, clazz.getType());

        if (primitive.equals(type)) {
            return builder
                    .superclass(ParserUtil.convertType(clazz.getParent(), getResolver()))
                    .addMethod(MethodSpec.constructorBuilder()
                            .addModifiers(Modifier.PUBLIC)
                            .addParameter(ParserUtil.convertPrimitive(primitive), VALUE)
                            .addStatement("$N($N)", SUPER, VALUE)
                            .build());
        } else {
            return new PrimitiveModelParser(getGroup()).parse(builder, new JavaPrimitive.Builder()
                    .setType(type)
                    .build());
        }
    }
}
