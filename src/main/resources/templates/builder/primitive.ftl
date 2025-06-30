<#include "../header.ftl">

public class ${content.type.toBuilder()} {

    private ${content.primitive.raw()} value;

    public ${content.type.toBuilder()}() {
        this(null);
    }

    public ${content.type.toBuilder()}(${content.type.toModel()} value) {
        this.value = value;
    }

    public ${content.type.toModel()} build() {
        return new ${content.type.toBuilder()}(this.value);
    }

    public ${content.type.toBuilder()} setValue(${content.primitive.raw()} value) {
        this.value = value;
        return this;
    }
}