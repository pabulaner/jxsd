<#include "../header.ftl">

public class ${to_model(name)} {

    private final Object value;

    <#list types as type>
    public ${to_model(name)}(${to_model(type)} value) {
        this.value = value;
    }
    </#list>

    public Object getRaw() {
        return this.value;
    }

    <#list types as type>
    public ${to_model(type)} get${to_upper(type)}() {
        return (${to_model(type)}) this.value;
    }
    </#list>
}