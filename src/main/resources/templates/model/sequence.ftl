<#import "../util.ftl" as util>
<#include "../header.ftl">

// SEQUENCE MODEL
<@util.decl_class content.type.toModel() /> {

    <@util.decl_inners "model" content.inners />

    <#list content.fields as field>
        private final ${field.type.toModel()} ${field.name.toVar()};
    </#list>

    public ${content.type.toModel()}(<#list content.fields as field>${field.type.toModel()} ${field.name.toVar()}<#sep>, </#list>) {
        <#list content.fields as field>
            this.${field.name.toVar()} = ${field.name.toVar()};
        </#list>
    }

    <#list content.fields as field>
        public ${field.type.toModel()} get${field.name.toUpper()}() {
            return this.${field.name.toVar()};
        }
    </#list>
}