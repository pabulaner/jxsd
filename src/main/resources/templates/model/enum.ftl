<#include "../header.ftl">

// ENUM MODEL
public enum ${content.type.toModel()} {

    <#list content.values as value>
        ${value},
    </#list>
}