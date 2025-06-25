<#import "util.ftl" as converter_util>
<#import "../util.ftl" as util>
<#include "../header.ftl">

<@util.decl_class content.type.toConverter() /> {

    <@converter_util.decl_constructor />

    <@converter_util.decl_from /> {
        <#list content.types as type>
            if (value.getVal() instanceof type.toDocx4j()) return new ${content.type.toModel()}(
            <#if type.isList()>
                value.getVal().stream().map(${type.toConverter()}::fromDocx4j).collect(Collectors.toList())
            <#else>
                ${type.toConverter()}.fromDocx4j(value.getVal())
            </#if>
            );
        </#list>

        return new ${content.type.toModel()}();
    }
}