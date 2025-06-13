<#include "../header.ftl">

public class ${util.to_builder(name, false)} {

    private final Object value;

    public ${util.to_builder(name, false)}() {
        this.value = null;
    }

    <#list types as type>
    public ${util.to_builder(name, false)}(${util.to_builder(type, false)} value) {
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
    public ${util.to_builder(name, false)} set{util.to_upper(type)}(${util.to_builder(type, false)}) {
        return (${util.to_builder(type, false)}) this.value;
    }
    </#list>
}