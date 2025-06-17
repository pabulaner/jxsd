<#include "../header.ftl">

public class ${content.type.toModel()} {

    private final Object value;

    <#if content.types?size == 1>
    <#assign type = content.types[0]>
    public ${content.type.toModel()}(${type.pkg + "." + type.toModel()} value) {
        this.value = value;
    }
    <#else>
    <#list content.types as type>
    public ${content.type.toModel()}(${type.toModel()} value) {
        this.value = value;
    }
    </#list>
    </#if>

    public Object getRaw() {
        return this.value;
    }

    <#if content.types?size == 1>
    <#assign type = content.types[0]>
    public ${type.pkg + "." + type.toModel()} get${type.toUpper()}() {
        return (${type.pkg + "." + type.toModel()}) this.value;
    }
    <#else>
    <#list content.types as type>
    public ${type.toModel()} get${type.toUpper()}() {
        return (${type.toModel()}) this.value;
    }
    </#list>
    </#if>
}