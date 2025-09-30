package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.gen.Generator;
import io.github.pabulaner.jxsd.gen.GeneratorConfig;
import io.github.pabulaner.jxsd.java.JavaParser;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;
import io.github.pabulaner.jxsd.transform.TransformMap;
import io.github.pabulaner.jxsd.xsd.XsdParser;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import org.plutext.jaxb.svg11.G;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException, SAXException, URISyntaxException {
        URL xsd = Main.class.getResource("/xsd/dml/dml-chart.xsd")
                .toURI()
                .toURL();

        XsdResult xsdResult = new XsdParser().parse(xsd);
        JavaResult javaResult = new JavaParser().parse(xsdResult);

        List<String> pkg = List.of("jxsd", "gen");
        TransformMap map = new TransformMap(List.of(Main.class.getResource("/transforms/transform.xml")));

        Resolver modelResolver = Resolvers.getDefault(javaResult.scope(), pkg, "model", map);
        Resolver builderResolver = Resolvers.getDefault(javaResult.scope(), pkg, "builder", map);
        Resolver converterResolver = Resolvers.getConverter(pkg, "converter", map);
        Resolver docx4jResolver = Resolvers.getDocx4j();

        List<List<SpecParser>> parsers = List.of(
                SpecParsers.getModelParsers(modelResolver),
                SpecParsers.getBuilderParsers(builderResolver),
                SpecParsers.getConverterParsers(converterResolver)
        );

        Map<String, Resolver> resolvers = new HashMap<>();
        resolvers.put(SpecKey.MODEL_RESOLVER, modelResolver);
        resolvers.put(SpecKey.BUILDER_RESOLVER, builderResolver);
        resolvers.put(SpecKey.CONVERTER_RESOLVER, converterResolver);
        resolvers.put(SpecKey.DOCX4J_RESOLVER, docx4jResolver);

        for (List<SpecParser> value : parsers) {
            GeneratorConfig config = new GeneratorConfig();

            config.setOutput("./src/main/java");
            config.setPkg(pkg);
            config.setParsers(value);
            config.setResolvers(resolvers);

            new Generator(config).generate(javaResult);
        }
    }
}
