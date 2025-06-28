<#macro decl_constructor content>
    private ${content.type.toConverter()}() {
        // empty
    }
</#macro>

<#macro decl_from content>
    public static ${content.type.toModel()} fromDocx4j(${(outer!content).type.toDocx4j()} value)
</#macro>