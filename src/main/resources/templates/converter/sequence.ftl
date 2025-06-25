<#import "util.ftl" as converter_util>
<#import "../util.ftl" as util>
<#include "../header.ftl">

<@util.decl_class content.type.toConverter() /> {

    <@util.decl_inners "converter" content.inners />

    <@converter_util.decl_constructor />

    <@converter_util.decl_from /> {
        return new ${content.type.toModel()}(
            <#list content.fields as field>
                <#if field.type.isList()>
                    value.get${field.name.toUpper()}().stream().map(${field.type.toConverter()}::fromDocx4j).collect(Collectors.toList())
                <#else>
                    ${field.type.toConverter()}.fromDocx4j(value.get${field.name.toUpper()}())
                </#if>
                <#sep>,</#sep>
            </#list>
        );
    }
}