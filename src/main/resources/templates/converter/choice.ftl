<#import "util.ftl" as converter_util>
<#import "../util.ftl" as util>
<#include "../header.ftl">

// CHOICE CONVERTER
<@util.decl_class content.type.toConverter() /> {

    <@util.decl_inners "converter" content.inners />

    <@converter_util.decl_constructor content/>

    <@converter_util.decl_from content /> {
        <#list content.fields as field>
            <#assign ref=scope.get(field.type) />
            <#if ref.name() == "JavaChoice">
                // THIS IS A JAVA CHOICE
                <#list ref.fields as other>
                    if (value.get${other.name.toUpper()} != null) return ${field.type.toModel()}.create${other.name.toUpper()}(
                        <#if other.type.isList()>
                            value.get${other.name.toUpper()}().stream().map(${other.type.toConverter()}::fromDocx4j).collect(Collectors.toList())
                        <#else>
                            ${other.type.toConverter()}.fromDocx4j(value.get${other.name.toUpper()}())
                        </#if>
                    );
                </#list>
                // THIS IS A JAVA CHOICE END
            <#else>
                if (value.get${field.name.toUpper()}() != null) return ${content.type.toModel()}.create${field.name.toUpper()}(
                <#if field.type.isList()>
                    value.get${field.name.toUpper()}().stream().map(${field.type.toConverter()}::fromDocx4j).collect(Collectors.toList())
                <#else>
                    ${field.type.toConverter()}.fromDocx4j(value.get${field.name.toUpper()}())
                </#if>
                );
            </#if>
        </#list>

        return new ${content.type.toModel()}();
    }
}