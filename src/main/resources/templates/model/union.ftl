<#include "../header.ftl">

public class ${content.type.toModel()} {

    private final Object value;

    <#list content.types as type>
    public ${content.type.toModel()}(${type.toModel()} value) {
        this.value = value;
    }
    </#list>

    public Object getRaw() {
        return this.value;
    }

    <#list content.types as type>
    public ${type.toModel()} get${type.toUpper()}() {
        return (${type.toModel()}) this.value;
    }
    </#list>
}