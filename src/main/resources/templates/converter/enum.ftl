<#import "../util.ftl">
<#include "../header.ftl">

public enum ${util.to_model(name)} {

    <#list values as value>
    ${value} <#sep>,<#/if>
    </#list>
}