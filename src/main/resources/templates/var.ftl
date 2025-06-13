<#import "util.ftl" as util>

<#-- MODEL -->
<#if name??>
    <#assign name_model = util.to_model(name, false)>
</#if>
<#if parent??>
    <#assign parent_model = util.to_model(parent, false)>
</#if>

<#-- BUILDER -->
<#if name??>
    <#assign name_builder = util.to_model(name, false)>
</#if>
<#if parent??>
    <#assign parent_builder = util.to_model(parent, false)>
</#if>