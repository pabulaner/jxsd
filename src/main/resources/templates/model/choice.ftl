<#import "../util.ftl" as util>
<#include "../header.ftl">

// CHOICE MODEL
<@util.decl_class content.type.toModel() /> {

    <@util.decl_inners "model" content.inners />

    private final int type;

    private final Object value;

    public ${content.type.toModel()}() {
        this(-1, null);
    }

    private ${content.type.toModel()}(int type, Object value) {
        this.type = type;
        this.value = value;
    }

    <#list content.fields as field>
        public static ${content.type.toModel()} create${field.name.toUpper()}(${field.type.toModel()} value) {
            return new ${content.type.toModel()}(${field_index}, value);
        }
    </#list>

    public Object getRaw() {
        return this.value;
    }

    <#list content.fields as field>
        public boolean is${field.name.toUpper()}() {
            return this.type == ${field_index};
        }

        public ${field.type.toModel()} get${field.name.toUpper()}() {
            if (this.type != ${field_index}) throw new ClassCastException();
            return (${field.type.toModel()}) value;
        }
    </#list>
}