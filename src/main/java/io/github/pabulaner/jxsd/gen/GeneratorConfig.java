package io.github.pabulaner.jxsd.gen;

import java.util.List;

public class GeneratorConfig {

    /**
     * The xsd files to use.
     */
    private List<String> input;

    /**
     * The directory for the generated classes.
     */
    private String output;

    /**
     * The package for the generated classes.
     */
    private List<String> pkg;

    public static GeneratorConfig createDefault() {
        GeneratorConfig result = new GeneratorConfig();
        result.input = List.of();
        result.output = "./target";
        result.pkg = List.of("jxsd", "gen");

        return result;
    }

    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
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
}
