<#import "util.ftl" as converter_util>
<#import "../util.ftl" as util>
<#include "../header.ftl">

// ENUM CONVERTER
<@util.decl_class content.type.toConverter() /> {

    <@converter_util.decl_constructor content/>

    <@converter_util.decl_from content /> {
        return null;
    }
}