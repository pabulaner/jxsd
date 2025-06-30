<#include "../header.ftl">

import java.util.ArrayList;

public class ${content.type.toBuilder()} {

    private Collection<${content.item.toUpper()}> values;

    public ${content.type.toBuilder()}() {
        this(new ArrayList<>());
    }

    public ${content.type.toBuilder()}(${content.type.toModel()} value) {
        this.values = value;
    }

    public ${content.type.toModel()} build() {
        return new ${content.type.toModel()}(this.values);
    }

    public ${content.type.toBuilder()} setValues(Collection<${content.item.toUpper()}> values) {
        this.values = values;
        return this;
    }
}