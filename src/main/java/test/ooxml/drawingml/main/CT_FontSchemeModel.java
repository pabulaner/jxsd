
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.main.CT_FontCollectionModel;
import test.ooxml.drawingml.main.CT_FontCollectionModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_FontSchemeModel {


    private final StringModel name;
    private final CT_FontCollectionModel majorFont;
    private final CT_FontCollectionModel minorFont;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_FontSchemeModel(StringModel name, CT_FontCollectionModel majorFont, CT_FontCollectionModel minorFont, CT_OfficeArtExtensionListModel extLst) {
        this.name = name;
        this.majorFont = majorFont;
        this.minorFont = minorFont;
        this.extLst = extLst;
    }

    public StringModel getName() {
        return this.name;
    }
    public CT_FontCollectionModel getMajorFont() {
        return this.majorFont;
    }
    public CT_FontCollectionModel getMinorFont() {
        return this.minorFont;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
