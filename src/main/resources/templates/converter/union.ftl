<#include "../header.ftl">

public class ${util.to_model(name, false)} {

    private final Object value;

    <#list types as type>
    public ${util.to_model(name, false)}(${util.to_model(type, false)} value) {
        this.value = value;
    }
    </#list>

    public Object getRaw() {
        return this.value;
    }

    <#list types as type>
    public ${util.to_model(type, false)} get${util.to_upper(type)}() {
        return (${util.to_model(type, false)}) this.value;
    }
    </#list>
}