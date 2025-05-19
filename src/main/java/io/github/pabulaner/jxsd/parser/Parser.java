package io.github.pabulaner.jxsd.parser;

public abstract class Parser<T> {

    private final ParserMap map;

    protected Parser(ParserMap map) {
        this.map = map;
    }

    public abstract Result parse(T xs);

    public ParserMap getMap() {
        return map;
    }
}
