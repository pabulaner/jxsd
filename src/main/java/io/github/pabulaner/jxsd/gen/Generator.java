package io.github.pabulaner.jxsd.gen;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.parser.extra.AddBuilderMethodToModelParser;
import io.github.pabulaner.jxsd.spec.parser.extra.AddJavadocToClassParser;
import io.github.pabulaner.jxsd.spec.parser.model.ChoiceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.EnumModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.InterfaceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.PrimitiveModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.RestrictionModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.SequenceModelParser;
import io.github.pabulaner.jxsd.spec.parser.model.UnionModelParser;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaInterface;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.SpecParserMap;
import io.github.pabulaner.jxsd.spec.parser.model.ModelParser;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Generator {

    private final GeneratorConfig config;

    public Generator(GeneratorConfig config) {
        this.config = config;
    }

    public void generate(JavaResult input) throws IOException {
        IOException[] exception = { null };

        input.classes().forEach(spec -> {
            SpecContext ctx = new SpecContext(config.getParsers());

            ctx.set(SpecKey.SCOPE, input.scope());
            ctx.set(SpecKey.SPEC, spec);
            ctx.setAll(config.getResolvers());

            SpecContext.exec(ctx);

            if (ctx.isCompleted()) {
                try {
                    TypeSpec.Builder builder = ctx.get(SpecKey.BUILDER);
                    List<String> pkg = ctx.get(SpecKey.PKG);

                    write(pkg, builder.build());
                } catch (IOException e) {
                    exception[0] = e;
                }
            }
        });

        if (exception[0] != null) {
            throw exception[0];
        }
    }

    private void write(List<String> pkg, TypeSpec spec) throws IOException {
        Path path = Path.of(config.getOutput());
        JavaFile.builder(String.join(".", pkg), spec)
                .build()
                .writeTo(path);
    }
}
