<#include "header.ftl">

public class ${name} extends ${parent} {

    public ${name}(${type} value) {
        super(value);

        <#list restrictions as restriction>
        if (!(${restriction})) throw new IllegalArgumentException();
        </#list>
    }
}