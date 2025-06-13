<#include "../header.ftl">

public class ${util.to_model(name, false)} extends ${util.to_model(parent, false)} {

    public ${util.to_model(name, false)}(${type} value) {
        super(value);

        <#list restrictions as restriction>
        if (!(${restriction})) throw new IllegalArgumentException();
        </#list>
    }
}