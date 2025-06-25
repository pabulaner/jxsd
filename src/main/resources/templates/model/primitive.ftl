<#import "../util.ftl" as util>
<#include "../header.ftl">

// PRIMITIVE MODEL
<@util.decl_class content.type.toModel() /> {

    private final ${content.primitive.toUpper()} value;

    public ${content.type.toModel()}(${content.primitive.toUpper()} value) {
        this.value = value;
    }

    public ${content.primitive.toUpper()} getValue() {
        return this.value;
    }
}