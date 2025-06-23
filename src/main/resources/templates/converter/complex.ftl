<#include "../header.ftl">

<#macro parse_inners inners first>
<#list inners as inner>
<#if inner.group?string == "SEQUENCE">
<@sequence inner first />
<#else>
<@union inner first />
</#if>
</#list>
</#macro>

<#macro sequence content first>
public <#if !first>static </#if>final class ${content.type.toConverter()} {

    <@parse_inners content.inners false />

    private ${content.type.toConverter()}() {
        // empty
    }

    public static ${content.type.toModel()} fromDocx4j(${content.type.toDocx4j()} value) {
        return new ${content.type.toModel()}(
        <#list content.fields as field>
        <#if field.type.isList()>
        value.get${field.name.toUpper()}().stream().map(${field.type.toConverter()}::fromDocx4j).collect(Collectors.toList());
        <#else>
        ${field.type.toConverter()}.fromDocx4j(value.get${field.name.toUpper()}())<#sep>,</#sep>
        </#if>
        </#list>
        );
    }
}
</#macro>

<#macro union content first>
public <#if !first>static </#if>final class ${content.type.toConverter()} {

    <@parse_inners content.inners false />

    private ${content.type.toConverter()}() {
        // empty
    }

    public static ${content.type.toModel} fromDocx4j(${content.type.toDocx4j} value) {
        <#list content.fields as field>
        if (value.get${field.name.toUpper()}() != null) return new ${content.type.toModel()}(<#if field.type.isList()>value.get${field.name.toUpper()}().stream().map(${field.type.toConverter()}::fromDocx4j).collect(Collectors.toList());<#else>${field.type.toConverter()}.fromDocx4j(value.get${field.name.toUpper()}());</#if>
        </#list>

        return new ${content.type.toModel()}();
    }
}
</#macro>

<#if content.group?string == "SEQUENCE">
<@sequence content true />
<#else>
<@union content true />
</#if>