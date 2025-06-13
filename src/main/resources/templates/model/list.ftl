<#include "../header.ftl">

import java.util.ArrayList;

public class ${util.to_model(name, false)} extends ArrayList<${util.to_model(parent, false)}> {

    public ${util.to_model(name, false)}(Collection<${util.to_model(parent, false)}> values) {
        super(values);
    }
}