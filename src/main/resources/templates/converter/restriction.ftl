<#import "util.ftl" as converter_util>
<#import "../util.ftl" as util>
<#include "../header.ftl">

<@util.decl_class content.type.toConverter() /> {

    <@converter_util.decl_constructor />

    public static ${content.type.toModel()} fromDocx4j(${content.primitive.toUpper()} value) {
        return new ${content.type.toModel()}(value);
    }
}