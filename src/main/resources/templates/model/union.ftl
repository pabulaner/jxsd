<#include "../header.ftl">

public class ${content.type.toModel()} <#if content.types?size == 1>extends ${content.types[0].pkg}.${content.types[0].toModel()} </#if>{

    private final Object value;

    public ${content.type.toModel()}() {
        this.value = null;
    }

    <#if (content.types?size > 1)>
    <#list content.types as type>
    public ${content.type.toModel()}(${type.toModel()} value) {
        this.value = value;
    }

    </#list>
    </#if>

    public Object getRaw() {
        return this.value;
    }

    <#if (content.types?size > 1)>
    <#list content.types as type>
    public ${type.toModel()} get${type.toUpper()}() {
        return (${type.toModel()}) this.value;
    }

    </#list>
    </#if>
}