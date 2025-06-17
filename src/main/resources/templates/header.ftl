<#import "var.ftl" as var>
<#import "util.ftl" as util>

package ${content.type().pkg()};

<#list imports as import>
<#if import?starts_with("java")>
import ${import};
<#else>
import ${import}Model;
</#if>
</#list>