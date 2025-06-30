<#include "../header.ftl">

public class ${content.type.toBuilder()} {

    private final Object value;

    public ${content.type.toBuilder()}() {
        this.value = null;
    }

    <#list types as type>
    public ${content.type.toBuilder()}(${type.toBuilder()} value) {
        this.value = value;
    }
    </#list>

    public ${util.to_model(name, false)} build() {
        <#list types as type>
        if (this.value instanceof ${util.to_model(type, false)}) return new ${util.to_model(name, false)}((${util.to_model(type, false)}) this.value);
        </#list>

        throw new IllegalStateException("Unreachable");
    }

    <#list types as type>
    public ${content.type.toBuilder()} set{type.toUpper()}(${type.toBuilder()} value) {
        return (${type.toBuilder()}) this.value;
    }
    </#list>
}