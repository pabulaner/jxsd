<#import "util.ftl" as converter_util>
<#import "../util.ftl" as util>
<#include "../header.ftl">

import java.util.ArrayList;
import java.util.Collection;

<@util.decl_class content.type.toConverter() /> {

    <@converter_util.decl_constructor />

    <@converter_util.decl_from /> {
        return null;
    }
}