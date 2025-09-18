package io.github.pabulaner.jxsd.gen;

import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;

import java.util.List;
import java.util.Map;

public class GeneratorConfig {

    /**
     * The directory for the generated classes.
     */
    private String output;

    /**
     * The package for the generated classes.
     */
    private List<String> pkg;

    /**
     * The parsers to generate the classes.
     */
    private List<SpecParser> parsers;

    /**
     * The resolvers that are used by the parsers.
     */
    private Map<String, Resolver> resolvers;

    public static GeneratorConfig createDefault() {
        GeneratorConfig result = new GeneratorConfig();
        result.output = "./target";
        result.pkg = List.of("jxsd", "gen");
        result.resolvers = Map.of();

        return result;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public List<String> getPkg() {
        return pkg;
    }

    public void setPkg(List<String> pkg) {
        this.pkg = pkg;
    }

    public List<SpecParser> getParsers() {
        return parsers;
    }

    public void setParsers(List<SpecParser> parsers) {
        this.parsers = parsers;
    }

    public Map<String, Resolver> getResolvers() {
        return resolvers;
    }

    public void setResolvers(Map<String, Resolver> resolvers) {
        this.resolvers = resolvers;
    }
}
