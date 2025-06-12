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

<#function to_type name is_list>
    <#if is_list>
        <#return "List<" + name + ">">
    <#else>
        <#return name>
    </#if>
</#function>

<#function to_model name is_list>
    <#return to_type(to_upper(name) + "Model", is_list)>
</#function>

<#function to_builder name is_list>
    <#return to_type(to_upper(name) + "Builder", is_list)>
</#function>

<#function to_lower name>
    <#return name[0..<1]?upper_case + name[1..]>
</#function>

<#function to_upper name>
    <#return name?cap_first>
</#function>