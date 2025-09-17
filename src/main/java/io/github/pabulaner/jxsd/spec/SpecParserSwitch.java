package io.github.pabulaner.jxsd.spec;

import io.github.pabulaner.jxsd.java.JavaClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SpecParserSwitch<TSpec extends JavaClass> implements SpecParser<TSpec> {

    private final boolean greedy;

    private final List<Entry> entries;

    public SpecParserSwitch(boolean greedy) {
        this.greedy = greedy;
        this.entries = new ArrayList<>();
    }

    @Override
    public void parse(SpecContext<TSpec> ctx) {
        for (Entry entry : entries) {
            if (entry.condition.test(ctx)) {
                entry.parser.parse(ctx);

                if (greedy) {
                    return;
                }
            }
        }
    }

    public void add(Predicate<SpecContext<TSpec>> condition, SpecParser<TSpec> parser) {
        entries.add(new Entry(condition, parser));
    }

    private final class Entry {

        final Predicate<SpecContext<TSpec>> condition;

        final SpecParser<TSpec> parser;

        private Entry(Predicate<SpecContext<TSpec>> condition, SpecParser<TSpec> parser) {
            this.condition = condition;
            this.parser = parser;
        }
    }
}
