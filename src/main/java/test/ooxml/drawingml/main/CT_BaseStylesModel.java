
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_ColorSchemeModel;
import test.ooxml.drawingml.main.CT_FontSchemeModel;
import test.ooxml.drawingml.main.CT_StyleMatrixModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_BaseStylesModel {


    private final CT_ColorSchemeModel clrScheme;
    private final CT_FontSchemeModel fontScheme;
    private final CT_StyleMatrixModel fmtScheme;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_BaseStylesModel(CT_ColorSchemeModel clrScheme, CT_FontSchemeModel fontScheme, CT_StyleMatrixModel fmtScheme, CT_OfficeArtExtensionListModel extLst) {
        this.clrScheme = clrScheme;
        this.fontScheme = fontScheme;
        this.fmtScheme = fmtScheme;
        this.extLst = extLst;
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
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
