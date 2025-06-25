<#import "../util.ftl" as util>
<#include "../header.ftl">

<#function to_full_name type>
    <#return type.pkg + "." + type.toModel()>
</#function>

<@util.decl_class content.type.toModel() /> {

    private final Object value;

    public ${content.type.toModel()}() {
        this.value = null;
    }

    <#if content.types?size == 1>
        <#assign type = content.types[0]>
        public ${content.type.toModel()}(${to_full_name(type)} value) {
            this.value = value;
        }
    <#else>
        <#list content.types as type>
            public ${content.type.toModel()}(${type.toModel()} value) {
                this.value = value;
            }
        </#list>
    </#if>

    public Object getRaw() {
        return this.value;
    }

    <#if content.types?size == 1>
        <#assign type = content.types[0]>
        public ${to_full_name(type)} get${type.toUpper()}() {
            return (${to_full_name(type)}) this.value;
        }
    <#else>
        <#list content.types as type>
            public ${type.toModel()} get${type.toUpper()}() {
                return (${type.toModel()}) this.value;
            }
        </#list>
    </#if>
}