<#function to_name name>
    <#local lower = to_lower(name)>
    <#local primitive = false>
    <#switch lower>
        <#on "byte"><#local primitive = true>
        <#on "short"><#local primitive = true>
        <#on "int"><#local primitive = true>
        <#on "long"><#local primitive = true>
        <#on "float"><#local primitive = true>
        <#on "double"><#local primitive = true>
        <#on "boolean"><#local primitive = true>
        <#on "char"><#local primitive = true>
        <#on "if"><#local primitive = true>
        <#on "else"><#local primitive = true>
        <#on "for"><#local primitive = true>
    </#switch>
    <#if primitive>
        <#return "_" + name>
    <#else>
        <#return name>
    </#if>
</#function>

<#function to_model name>
    <#return to_upper(name) + "Model">
</#function>

<#function to_builder name>
    <#return to_upper(name) + "Builder">
</#function>

<#function to_lower name>
    <#return name[0..1]?upper_case + name[1]>
</#function>

<#function to_upper name>
    <#return name?cap_first>
</#function>