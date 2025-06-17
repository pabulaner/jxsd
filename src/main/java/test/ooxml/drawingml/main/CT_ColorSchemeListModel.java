
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_ColorSchemeAndMappingModel;


public class CT_ColorSchemeListModel {


    private final CT_ColorSchemeAndMappingModel extraClrScheme;

    public CT_ColorSchemeListModel(CT_ColorSchemeAndMappingModel extraClrScheme) {
        this.extraClrScheme = extraClrScheme;
    }

    public CT_ColorSchemeAndMappingModel getExtraClrScheme() {
        return this.extraClrScheme;
    }
}
