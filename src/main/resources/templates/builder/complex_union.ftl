<#include "../header.ftl">

import java.util.stream.Collectors;

public class HelloHello${util.to_builder(name, false)} {

    <#include "complex_inners.ftl">

    private Object value;

    public ${util.to_builder(name, false)}() {
        this.value = null;
    }

    <#list fields as field>
    public ${util.to_builder(name, false)}(${util.to_model(field.type, field.is_list)} value) {
        this.set${util.to_upper(field.name)}(value);
    }
    </#list>

    public ${util.to_model(name, false)} build() {

    }

    <#list fields as field>
    public ${util.to_builder(name, false)} set${util.to_upper(field.name)}(${util.to_model(field.type, field.is_list)} value) {
        <#if field.is_list>
        this.value = value.stream()
                .map(${util.to_builder(field.type, false)}::new)
                .collect(Collectors.toList());
        <#else>
        this.value = new ${util.to_builder(field.type, false)}(value);
        </#if>
        return this;
    }
    </#list>
}