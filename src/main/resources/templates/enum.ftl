<#include "header.ftl">

public enum ${name} {

    <#list values as value>
    ${value} <#if item_has_next>,<#/if>
    </#list>
}