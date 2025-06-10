<#include "header.ftl">

public class ${name} {

    private final Object value;

    <#list types as type>
    public ${name}(${type} value) {
        this.value = value;
    }
    </#list>

    public Object getRaw() {
        return this.value;
    }

    <#list types as type>
    public ${type} get${type}() {
        return (${type}) this.value;
    }
    </#list>
}