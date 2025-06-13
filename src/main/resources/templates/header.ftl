<#import "var.ftl" as var>
<#import "util.ftl" as util>

<#if package??>
package ${package};
</#if>

<#if imports??>
<#list imports as import>
import ${import};
</#list>
</#if>