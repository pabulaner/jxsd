
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.main.CT_BaseStylesModel;
import test.ooxml.drawingml.main.CT_ObjectStyleDefaultsModel;
import test.ooxml.drawingml.main.CT_ColorSchemeListModel;
import test.ooxml.drawingml.main.CT_CustomColorListModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_OfficeStyleSheetModel {


    private final StringModel name;
    private final CT_BaseStylesModel themeElements;
    private final CT_ObjectStyleDefaultsModel objectDefaults;
    private final CT_ColorSchemeListModel extraClrSchemeLst;
    private final CT_CustomColorListModel custClrLst;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_OfficeStyleSheetModel(StringModel name, CT_BaseStylesModel themeElements, CT_ObjectStyleDefaultsModel objectDefaults, CT_ColorSchemeListModel extraClrSchemeLst, CT_CustomColorListModel custClrLst, CT_OfficeArtExtensionListModel extLst) {
        this.name = name;
        this.themeElements = themeElements;
        this.objectDefaults = objectDefaults;
        this.extraClrSchemeLst = extraClrSchemeLst;
        this.custClrLst = custClrLst;
        this.extLst = extLst;
    }

    public StringModel getName() {
        return this.name;
    }
    public CT_BaseStylesModel getThemeElements() {
        return this.themeElements;
    }
    public CT_ObjectStyleDefaultsModel getObjectDefaults() {
        return this.objectDefaults;
    }
    public CT_ColorSchemeListModel getExtraClrSchemeLst() {
        return this.extraClrSchemeLst;
    }
    public CT_CustomColorListModel getCustClrLst() {
        return this.custClrLst;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
