package io.github.pabulaner.jxsd.gen;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

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
