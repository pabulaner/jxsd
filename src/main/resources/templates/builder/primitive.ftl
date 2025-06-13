<#include "../header.ftl">

public class ${util.to_builder(name, false)} {

    private ${util.to_upper(type)} value;

    public ${util.to_builder(name, false)}(${util.to_upper(type)} value) {
        this(null);
    }

    public ${util.to_builder(name, false)}(${util.to_upper(type)} value) {
        this.value = value;
    }

    public ${util.to_model(name, false)} build() {
        return new ${util.to_model(name, false)}(this.value);
    }

    public ${util.to_builder(name, false)} setValue(${util.to_upper(type)} value) {
        this.value = value;
        return this;
    }
}