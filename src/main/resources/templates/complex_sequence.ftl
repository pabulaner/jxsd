<#include "header.ftl">

public class ${name} {

    <#include "complex_inners.ftl">

    <#list fields as field>
    private final ${field.type} ${field.lowerName};
    </#list>

    public ${name}(<#list fields as field>${field.type} ${field.lowerName} <#sep>, </#list>) {
        <#list fields as field>
        this.${field.lowerName} = ${field.lowerName};
        </#list>
    }

    <#list fields as field>
    public ${field.type} get${field.upperName}() {
        return this.${field.lowerName};
    }
    </#list>
}