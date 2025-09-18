package io.github.pabulaner.jxsd.spec.parser.extra;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaList;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;

public class AddJavadocToClassParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaClass spec = ctx.get(SpecKey.SPEC);
        TypeSpec.Builder builder = ctx.get(SpecKey.BUILDER);

        String name = switch (spec) {
            case JavaPrimitive ignored -> "primitive";
            case JavaRestriction ignored -> "restriction";
            case JavaList ignored -> "list";
            case JavaUnion ignored -> "union";
            case JavaEnum ignored -> "enum";
            case JavaSequence ignored -> "sequence";
            case JavaChoice ignored -> "choice";
            default -> throw new IllegalStateException("Unexpected value: " + spec);
        };

        builder.addJavadoc("This is a generated $N class.", name);
    }
}
