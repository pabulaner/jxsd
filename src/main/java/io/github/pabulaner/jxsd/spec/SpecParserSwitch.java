package io.github.pabulaner.jxsd.spec;

import io.github.pabulaner.jxsd.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SpecParserSwitch implements SpecParser {

    private final List<Pair<Predicate<SpecContext>, SpecParser>> entries;

    public SpecParserSwitch() {
        this.entries = new ArrayList<>();
    }

    @Override
    public void parse(SpecContext ctx) {
        for (Pair<Predicate<SpecContext>, SpecParser> entry : entries) {
            if (entry.first().test(ctx)) {
                entry.second().parse(ctx);
                return;
            }
        }

        ctx.next();
    }

    public SpecParserSwitch add(Predicate<SpecContext> condition, SpecParser parser) {
        entries.add(new Pair<>(condition, parser));
        return this;
    }
}
