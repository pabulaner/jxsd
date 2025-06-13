<#include "../header.ftl">

public class ${util.to_builder(name, false)} {

    <#include "complex_inners.ftl">

    <#list fields as field>
    private final ${util.to_builder(field.type, field.is_list)} ${util.to_name(field.name)};
    </#list>

    public ${util.to_builder(name, false)}(<#list fields as field>${util.to_builder(field.type, field.is_list)} ${util.to_name(field.name)} <#sep>, </#list>) {
        <#list fields as field>
        this.${util.to_name(field.name)} = ${util.to_name(field.name)};
        </#list>
    }

    <#list fields as field>
    public ${util.to_builder(field.type, field.is_list)} get${util.to_upper(field.name)}() {
        return this.${util.to_name(field.name)};
    }
    </#list>
}