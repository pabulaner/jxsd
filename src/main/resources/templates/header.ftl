<#if package??>
package ${package};
</#if>

<#if imports??>
<#list imports as import>
import ${import};
</#list>
</#if>