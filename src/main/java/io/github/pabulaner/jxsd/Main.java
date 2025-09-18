package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.gen.GeneratorConfig;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;
import io.github.pabulaner.jxsd.transform.TransformMap;
import org.plutext.jaxb.svg11.G;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException, SAXException, URISyntaxException {
        String xsd = Main.class.getResource("/xsd/dml/dml-chart.xsd").toExternalForm();
        List<String> pkg = List.of("jxsd", "gen");
        TransformMap map = new TransformMap(List.of());

        Resolver modelResolver = Resolvers.getDefault(pkg, "model", map);
        Resolver builderResolver = Resolvers.getDefault(pkg, "builder", map);

        List<List<SpecParser>> parsers = List.of(
                SpecParsers.getModelParsers(modelResolver),
                SpecParsers.getBuilderParsers(builderResolver));

        Map<String, Resolver> resolvers = new HashMap<>();
        resolvers.put(SpecKey.MODEL_RESOLVER, modelResolver);
        resolvers.put(SpecKey.BUILDER_RESOLVER, builderResolver);

        for (List<SpecParser> value : parsers) {
            GeneratorConfig config = new GeneratorConfig();

            config.setOutput("./target");
            config.setPkg(pkg);
            config.setParsers(value);
            config.setResolvers(resolvers);

            Parser parser = new Parser(xsd, config);
            parser.parse();
        }
    }
}
