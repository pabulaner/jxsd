<#include "../header.ftl">

public enum ${content.type.toModel()} {

    <#list content.values as value>
        ${value},
    </#list>
}