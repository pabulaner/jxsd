<#include "../header.ftl">

public class ${util.to_model(name, false)} {

    <#include "complex_inners.ftl">

    private final Object value;

    <#list fields as field>
    public ${util.to_model(name, false)}(${util.to_model(field.type, field.is_list)} value) {
        this.value = value;
    }
    </#list>

    public Object getRaw() {
        return this.value;
    }

    <#list fields as field>
    public ${util.to_model(field.type, field.is_list)} get${util.to_upper(field.name)}() {
        return (${util.to_model(field.type, field.is_list)}) value;
    }
    </#list>
}