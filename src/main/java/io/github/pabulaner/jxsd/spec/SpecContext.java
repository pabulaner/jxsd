package io.github.pabulaner.jxsd.spec;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public final class SpecContext {

    private final Queue<SpecParser> parsers;

    private boolean aborted;

    private final Map<String, Object> data;

    public SpecContext(Queue<SpecParser> parsers) {
        this.parsers = parsers;
        this.aborted = false;
        this.data = new HashMap<>();
    }

    public static void exec(SpecContext ctx) {
        ctx.next();

        if (ctx.isCompleted() == ctx.isAborted()) {
            throw new IllegalStateException("Context did not exec correctly");
        }
    }

    public SpecContext copy() {
        SpecContext ctx = new SpecContext(parsers);
        ctx.data.putAll(data);

        return ctx;
    }

    public void next() {
        parsers.remove().parse(this);
    }

    public void abort() {
        aborted = true;
    }

    @SuppressWarnings("unchecked")
    public <TResult> TResult get(String key) {
        if (has(key)) {
            return (TResult) data.get(key);
        }

        throw new IllegalArgumentException("Key '" + key + "' is not present in context");
    }

    public <TResult> TResult getOrDefault(String key, TResult defaultValue) {
        return has(key)
                ? get(key)
                : defaultValue;
    }

    public void set(String key, Object value) {
        data.put(key, value);
    }

    public boolean has(String key) {
        return data.containsKey(key);
    }

    public boolean isCompleted() {
        return parsers.isEmpty() && !aborted;
    }

    public boolean isAborted() {
        return aborted;
    }
}
