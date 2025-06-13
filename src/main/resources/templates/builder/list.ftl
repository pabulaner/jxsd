<#include "../header.ftl">

import java.util.ArrayList;

public class ${util.to_builder(name, false)} {

    private Collection<${util.to_model(parent, false)}> values;

    public ${util.to_builder(name, false)}() {
        this(new ArrayList<>());
    }

    public ${util.to_builder(name, false)}(${util.to_model(name, false)} value) {
        this.values = value;
    }

    public ${util.to_model(name, false)} build() {
        return new ${util.to_model(name, false)}(this.values);
    }

    public ${util.to_builder(name, false)} setValues(Collection<${util.to_model(parent, false)}> values) {
        this.values = values;
        return this;
    }
}