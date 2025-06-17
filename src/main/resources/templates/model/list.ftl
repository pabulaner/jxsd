<#include "../header.ftl">

import java.util.ArrayList;

public class ${content.type.toModel()} extends ArrayList<${content.itemType.toModel()}> {

    public ${content.type.toModel()}(Collection<${content.itemType.toModel()}> values) {
        super(values);
    }
}