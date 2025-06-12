<#include "header.ftl">

public class ${name} {

    <#list inners as inner>
    ${inner}
    </#list>

    <#list fields as field>
    private final ${field.type} ${field.lowerName};
    </#list>

    public ${name}(
        <#list fields as field>
        ${field.type} ${field.lowerName} <#if item_has_next>,</#if>
        </#list>
    ) {
        <#list fields as field>
        this.${field.name} = ${field.lowerName};
        </#list>
    }

    <#list fields as field>
    public ${field.type} get{$field.upperName}() {
        return this.${field.lowerName};
    }
    </#list>
}