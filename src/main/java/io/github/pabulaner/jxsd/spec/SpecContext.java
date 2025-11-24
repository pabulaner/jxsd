package io.github.pabulaner.jxsd.spec;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public final class SpecContext {

    private int index;

    private final List<SpecParser> parsers;

    private boolean completed;

    private boolean aborted;

    private final Map<String, Object> data;

    public SpecContext(List<SpecParser> parsers) {
        this.index = 0;
        this.parsers = parsers;
        this.completed = false;
        this.aborted = false;
        this.data = new HashMap<>();
    }

    public static void exec(SpecContext ctx) {
        ctx.next();

        if (!ctx.isFinished()) {
            throw new IllegalStateException("Context did not finish correctly");
        }
    }

    public SpecContext copy() {
        SpecContext ctx = new SpecContext(parsers);
        ctx.data.putAll(data);

        return ctx;
    }

    public void next() {
        if (isFinished()) {
            throw new IllegalStateException("Context is already finished");
        }

        if (index < parsers.size()) {
            parsers.get(index++).parse(this);
        } else {
            completed = true;
        }
    }

    public void abort() {
        if (isFinished()) {
            throw new IllegalStateException("Context is already finished");
        }

        aborted = true;
    }

    @SuppressWarnings("unchecked")
    public <TResult> TResult get(String key) {
        if (has(key)) {
            return (TResult) data.get(key);
        }

        throw new NoSuchElementException("Key '" + key + "' is not present in context");
    }

    public <TResult> TResult getOrDefault(String key, TResult defaultValue) {
        return has(key)
                ? get(key)
                : defaultValue;
    }

    public void set(String key, Object value) {
        data.put(key, value);
    }

    public void setAll(Map<String, ?> values) {
        data.putAll(values);
    }

    public boolean has(String key) {
        return data.containsKey(key);
    }

    public boolean isCompleted() {
        return completed;
    }

    public boolean isAborted() {
        return aborted;
    }

    private boolean isFinished() {
        return completed || aborted;
    }
}
