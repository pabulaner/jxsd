<#macro decl_class name>
    public <#if is_inner!false>static </#if>class ${name}
</#macro>

<#macro decl_inners type content>
    <#assign is_inner=true>
    <#if !outer??>
        <#assign outer=content>
    </#if>
    <#list content.inners as inner>
        <#assign content=inner>
        <#switch inner.name>
            <#on "JavaPrimitive"><#local file="primitive">
            <#on "JavaRestriction"><#local file="restriction">
            <#on "JavaList"><#local file="list">
            <#on "JavaUnion"><#local file="union">
            <#on "JavaEnum"><#local file="enum">
            <#on "JavaSequence"><#local file="sequence">
            <#on "JavaChoice"><#local file="choice">
        </#switch>
        <#include type + "/" + file + ".ftl">
    </#list>
</#macro>