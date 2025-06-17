<#include "../header.ftl">

public class ${content.type.toModel(false)} {

    private final ${content.type.toUpper(true)} value;

    public ${content.type.toModel(false)}(${content.type.toUpper(true)} value) {
        this.value = value;
    }

    public ${content.type.toUpper(true)} getValue() {
        return this.value;
    }
}