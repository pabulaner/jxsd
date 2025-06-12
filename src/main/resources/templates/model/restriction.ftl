<#include "../header.ftl">

public class ${to_model(name)} extends ${to_model(parent)} {

    public ${to_model(name)}(${type} value) {
        super(value);

        <#list restrictions as restriction>
        if (!(${restriction})) throw new IllegalArgumentException();
        </#list>
    }
}