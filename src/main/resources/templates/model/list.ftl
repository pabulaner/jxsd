<#include "../header.ftl">

import java.util.ArrayList;
import java.util.Collection;

public class ${content.type.toModel()} extends ArrayList<${content.itemType.toModel()}> {

    public ${content.type.toModel()}(Collection<${content.itemType.toModel()}> values) {
        super(values);
    }
}