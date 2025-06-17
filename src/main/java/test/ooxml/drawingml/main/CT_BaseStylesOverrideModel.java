
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_ColorSchemeModel;
import test.ooxml.drawingml.main.CT_FontSchemeModel;
import test.ooxml.drawingml.main.CT_StyleMatrixModel;


public class CT_BaseStylesOverrideModel {


    private final CT_ColorSchemeModel clrScheme;
    private final CT_FontSchemeModel fontScheme;
    private final CT_StyleMatrixModel fmtScheme;

    public CT_BaseStylesOverrideModel(CT_ColorSchemeModel clrScheme, CT_FontSchemeModel fontScheme, CT_StyleMatrixModel fmtScheme) {
        this.clrScheme = clrScheme;
        this.fontScheme = fontScheme;
        this.fmtScheme = fmtScheme;
    }

    public CT_ColorSchemeModel getClrScheme() {
        return this.clrScheme;
    }
    public CT_FontSchemeModel getFontScheme() {
        return this.fontScheme;
    }
    public CT_StyleMatrixModel getFmtScheme() {
        return this.fmtScheme;
    }
}
