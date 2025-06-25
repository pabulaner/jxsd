<#import "../util.ftl" as util>
<#include "../header.ftl">

<@util.decl_class content.type.toModel() /> {

    <@util.decl_inners "model" content.inners />

    private final Object value;

    public ${content.type.toModel()}() {
        this.value = null;
    }

    <#list content.fields as field>
        public ${content.type.toModel()}(${field.type.toModel()} value) {
            this.value = value;
        }
    </#list>

    public Object getRaw() {
        return this.value;
    }

    <#list content.fields as field>
        public ${field.type.toModel()} get${field.name.toUpper()}() {
            return (${field.type.toModel()}) value;
        }
    </#list>
}