<#import "../util.ftl" as util>
<#include "../header.ftl">

// RESTRICTION MODEL
<@util.decl_class content.type.toModel() /> extends ${content.parent.toModel()} {

    public ${content.type.toModel()}(${content.primitive.toUpper()} value) {
        super(value);

        <#list content.restrictions as restriction>
            if (!(${restriction})) throw new IllegalArgumentException();
        </#list>
    }
}