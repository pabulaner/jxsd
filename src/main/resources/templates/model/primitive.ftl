<#include "../header.ftl">

public class ${to_model(name)} {

    private final ${type} value;

    public ${to_model(name)}(${type} value) {
        this.value = value;
    }

    public ${type} getValue() {
        return this.value;
    }
}