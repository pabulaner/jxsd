<#include "../header.ftl">

public final class ${content.type.toConverter()} {

    private ${content.type.toConverter()} {
        // empty
    }

    public static ${content.type.toModel()} fromDocx4j(${content.primitive.toUpper()} value) {
        return new ${content.type.toModel()}(value);
    }
}