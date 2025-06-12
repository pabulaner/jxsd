<#include "../header.ftl">

public class ${to_model(name)} {

    <#include "complex_inners.ftl">

    <#list fields as field>
    private final ${to_model(field.type)} ${to_name(field.name)};
    </#list>

    public ${to_model(name)}(<#list fields as field>${to_model(field.type)} ${to_name(field.name)} <#sep>, </#list>) {
        <#list fields as field>
        this.${to_name(field.name)} = ${to_name(field.name)};
        </#list>
    }

    <#list fields as field>
    public ${to_model(field.type)} get${to_upper(field.name)}() {
        return this.${to_name(field.name)};
    }
    </#list>
}