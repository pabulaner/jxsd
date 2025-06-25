<#import "../util.ftl" as util>
<#include "../header.ftl">

import java.util.ArrayList;
import java.util.Collection;

// LIST MODEL
<@util.decl_class content.type.toModel() /> extends ArrayList<${content.itemType.toModel()}> {

    public ${content.type.toModel()}(Collection<${content.itemType.toModel()}> values) {
        super(values);
    }
}