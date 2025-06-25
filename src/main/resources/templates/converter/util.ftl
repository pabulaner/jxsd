<#macro decl_constructor>
    private ${content.type.toConverter()}() {
        // empty
    }
</#macro>

<#macro decl_from>
    private ${content.type.toModel()} fromDocx4j(${content.type.toDocx4j()} value)
</#macro>