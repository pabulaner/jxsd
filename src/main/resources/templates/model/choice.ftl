<#import "../util.ftl" as util>
<#include "../header.ftl">

// CHOICE MODEL
<@util.decl_class content.type.toModel() /> {

    <@util.decl_inners "model" content />

    private final Object value;

    public ${content.type.toModel()}(Object value) {
        // TODO: add validation
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    <#list content.fields as field>
        public boolean is${field.name.toUpper()}() {
            return this.value instanceof ${field.type.toModel()};
        }

        public ${field.type.toModel()} get${field.name.toUpper()}() {
            return (${field.type.toModel()}) value;
        }
    </#list>
}