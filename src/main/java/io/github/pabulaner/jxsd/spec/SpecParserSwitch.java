package io.github.pabulaner.jxsd.spec;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SpecParserSwitch implements SpecParser {

    private final List<Entry> entries;

    public SpecParserSwitch() {
        this.entries = new ArrayList<>();
    }

    @Override
    public void parse(SpecContext ctx) {
        for (Entry entry : entries) {
            if (entry.condition.test(ctx)) {
                entry.parser.parse(ctx);
                return;
            }
        }

        ctx.next();
    }

    public SpecParserSwitch add(Predicate<SpecContext> condition, SpecParser parser) {
        entries.add(new Entry(condition, parser));
        return this;
    }

    private record Entry(Predicate<SpecContext> condition, SpecParser parser) {
    }
}
