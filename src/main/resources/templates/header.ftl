<#import "var.ftl" as var>
<#import "util.ftl" as util>

<#if pkg??>
package ${pkg};
</#if>

<#list imports as import>
import ${import};
</#list>