package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaParser;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.out.Writer;
import io.github.pabulaner.jxsd.out.parser.ParserMap;
import io.github.pabulaner.jxsd.out.parser.builder.BuilderParserGroup;
import io.github.pabulaner.jxsd.out.parser.converter.ConverterParserGroup;
import io.github.pabulaner.jxsd.out.parser.model.ModelParserGroup;
import io.github.pabulaner.jxsd.transform.TransformResult;
import io.github.pabulaner.jxsd.transform.Transformer;
import io.github.pabulaner.jxsd.xsd.XsdParser;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JXsdParser {

    public static class Config {

        private final Map<String, String> pkgConverter;

        private List<String> basePkg;

        private URL xsdFile;

        private final List<URL> transformerFiles;

        private Path outputPath;

        public Config() {
            pkgConverter = new HashMap<>();
            transformerFiles = new ArrayList<>();
        }

        public Config addPkgConverter(String before, String after) {
            this.pkgConverter.put(before, after);
            return this;
        }

        public Config setBasePkg(List<String> basePkg) {
            this.basePkg = basePkg;
            return this;
        }

        public Config setXsdFile(URL xsdFile) {
            this.xsdFile = xsdFile;
            return this;
        }

        public Config addTransformFile(URL file) {
            this.transformerFiles.add(file);
            return this;
        }

        public Config setOutputPath(Path outputPath) {
            this.outputPath = outputPath;
            return this;
        }
    }

    public static void parse(Config config) throws SAXException, IOException, TemplateException {
        XsdResult xsd = new XsdParser().parse(config.xsdFile);
        JavaResult java = new JavaParser().parse(xsd);
        TransformResult transform = new Transformer(List.of(JXsdParser.class.getResource("/transforms/transform.xml"))).transform(java);
        Writer writer = new Writer(transform.classes());
        ParserMap map = new ParserMap(transform.scope(), transform.map());

        map.addGroup(ModelParserGroup.NAME, new ModelParserGroup(map, Resolvers.getDefault(config.basePkg, "model", transform.map())));
        map.addGroup(BuilderParserGroup.NAME, new BuilderParserGroup(map, Resolvers.getDefault(config.basePkg, "builder", transform.map())));
        map.addGroup(ConverterParserGroup.NAME, new ConverterParserGroup(map, Resolvers.getDefault(config.basePkg, "converter", transform.map())));

        writer.write(config.outputPath, map);

        // TODO: find nice way to do this
        Path path = config.outputPath;

        for (String other : config.basePkg) {
            path = path.resolve(other);
        }

        path = path.resolve("converter/drawingml/main/SystemColorConverter.java");
        String content = Files.readString(path).replaceAll("SystemColorValValueConverter.fromDocx4J\\(value.getVal\\(\\)\\), HexBinary3ValueConverter.fromDocx4J\\(value.getLastClr\\(\\)\\)", "null, null");

        Files.writeString(path, content);

        path = path.getParent().resolve("SystemColorValValueConverter.java");
        Files.delete(path);
    }

    private static JavaResult filter(JavaResult result) {
        JavaScope scope = result.scope();
        List<JavaClass> classes = result.classes()
                .stream()
                .toList();

        return new JavaResult(scope, classes);
    }
}
