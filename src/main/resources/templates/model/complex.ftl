<#include "../header.ftl">

<#macro parse_inners inners>
<#list inners as inner>
<#if inner.group?string == "SEQUENCE">
<@sequence inner />
<#else>
<@union inner />
</#if>
</#list>
</#macro>

<#macro sequence content>
public class ${content.type.toModel()} {

    <@parse_inners content.inners />

    <#list content.fields as field>
    private final ${field.type.toModel()} ${field.name.toVar()};

    </#list>

    public ${content.type.toModel()}(<#list content.fields as field>${field.type.toModel()} ${field.name.toVar()}<#sep>, </#list>) {
        <#list content.fields as field>
        this.${field.name.toVar()} = ${field.name.toVar()};
        </#list>
    }

    <#list content.fields as field>
    public ${field.type.toModel()} get${field.name.toUpper()}() {
        return this.${field.name.toVar()};
    }

    </#list>
}
</#macro>

<#macro union content>
public class ${content.type.toModel()} {

    <@parse_inners content.inners />

    private final Object value;

    <#list content.fields as field>
    public ${content.type.toModel()}(${field.type.toModel()} value) {
        this.value = value;
    }
    </#list>

    public Object getRaw() {
        return this.value;
    }

    <#list content.fields as field>
    public ${field.type.toModel()} get${field.name.toUpper()}() {
        return (${field.type.toModel()}) value;
    }

    </#list>
}
</#macro>

<@sequence content />