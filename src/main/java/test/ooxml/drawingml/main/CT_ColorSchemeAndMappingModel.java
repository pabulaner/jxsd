
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_ColorSchemeModel;
import test.ooxml.drawingml.main.CT_ColorMappingModel;


public class CT_ColorSchemeAndMappingModel {


    private final CT_ColorSchemeModel clrScheme;
    private final CT_ColorMappingModel clrMap;

    public CT_ColorSchemeAndMappingModel(CT_ColorSchemeModel clrScheme, CT_ColorMappingModel clrMap) {
        this.clrScheme = clrScheme;
        this.clrMap = clrMap;
    }

    public CT_ColorSchemeModel getClrScheme() {
        return this.clrScheme;
    }
    public CT_ColorMappingModel getClrMap() {
        return this.clrMap;
    }
}
