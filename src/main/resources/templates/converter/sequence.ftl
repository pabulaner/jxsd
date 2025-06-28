<#import "util.ftl" as converter_util>
<#import "../util.ftl" as util>
<#include "../header.ftl">

// SEQUENCE CONVERTER
<@util.decl_class content.type.toConverter() /> {

    <@util.decl_inners "converter" content />

    <@converter_util.decl_constructor content />

    <@converter_util.decl_from content /> {
        <#list content.fields as field>
            <#assign ref=scope.get(field.type) />
            <#if ref.name() == "JavaChoice">
                ${field.type().toModel()} ${field.name().toVar()}

                <#if field.type.isList()>
                    = value.get${field.name.toUpper()}().stream().map(${field.type.toModel()}::new).collect(Collectors.toList());
                <#else>
                    = new ${field.type.toModel()}();

                    <#list ref.fields as other>
                        if (value.get${other.name.toUpper()} != null) ${field.name.toVar()} = value.get${field.name.toUpper()};
                    </#list>
                </#if>
            </#if>
        </#list>
        return new ${content.type.toModel()}(
            <#list content.fields as field>
                <#if ref.name() == "JavaChoice">
                    ${field.name.toVar()}
                <#else>
                    <#if field.type.isList()>
                        value.get${field.name.toUpper()}().stream().map(${field.type.toConverter()}::fromDocx4j).collect(Collectors.toList())
                    <#else>
                        ${field.type.toConverter()}.fromDocx4j(value.get${field.name.toUpper()}())
                    </#if>
                </#if>
                <#sep>,</#sep>
            </#list>
        );
    }
}