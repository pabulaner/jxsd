<#include "header.ftl">

public enum ${name} {

    <#list values as value>
    ${value} <#sep>,<#/if>
    </#list>
}