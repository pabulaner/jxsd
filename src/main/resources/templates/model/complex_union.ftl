<#include "../header.ftl">

public class ${to_model(name)} {

    <#include "complex_inners.ftl">

    private final Object value;

    <#list fields as field>
    public ${to_model(name)}(${to_model(field.type)} value) {
        this.value = value;
    }
    </#list>

    public Object getRaw() {
        return this.value;
    }

    <#list fields as field>
    public ${to_model(field.type)} get${to_upper(field.name)}() {
        return (${to_model(field.type)}) value;
    }
    </#list>
}