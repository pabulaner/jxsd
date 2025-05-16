package io.github.pabulaner.jxsd.input.type;

import java.util.List;

public class RestrictionType extends ValueType {

    private final List<Restriction> restrictions;

    public RestrictionType(String name, ValueType base, List<Restriction> restrictions) {
        super(Kind.RESTRICTION, name, base);
        this.restrictions = restrictions;
    }

    public List<Restriction> getRestrictions() {
        return restrictions;
    }
}
