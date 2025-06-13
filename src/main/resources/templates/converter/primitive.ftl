<#include "../header.ftl">

public class ${util.to_model(name, false)} {

    private final ${util.to_upper(type)} value;

    public ${util.to_model(name, false)}(${util.to_upper(type)} value) {
        this.value = value;
    }

    public ${util.to_upper(type)} getValue() {
        return this.value;
    }
}