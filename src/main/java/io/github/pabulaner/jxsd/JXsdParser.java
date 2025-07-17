package io.github.pabulaner.jxsd;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.java.JavaParser;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.out.OutWriter;
import io.github.pabulaner.jxsd.out.builder.BuilderParserMap;
import io.github.pabulaner.jxsd.out.converter.ConverterParserMap;
import io.github.pabulaner.jxsd.out.model.ModelParserMap;
import io.github.pabulaner.jxsd.xsd.XsdParser;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JXsdParser {

    public static class Config {

        private final Map<String, String> pkgConverter;

        private String basePkg;

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

        public Config setBasePkg(String basePkg) {
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
        OutWriter writer = new OutWriter(java);

        writer.write(config.outputPath, List.of(
                new ModelParserMap(),
                new BuilderParserMap(),
                new ConverterParserMap()));
    }
}
