<#include "header.ftl">

public class ${name} {

    <#include "complex_inners.ftl">

    private final Object value;

    <#list fields as field>
    public ${name}(${field.type} value) {
        this.value = value;
    }
    </#list>

    public Object getRaw() {
        return this.value;
    }

    <#list fields as field>
    public ${field.type} get${field.upperName}() {
        return (${field.type}) value;
    }
    </#list>
}