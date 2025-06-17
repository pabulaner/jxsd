
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_GvmlPictureNonVisualModel;
import test.ooxml.drawingml.main.CT_BlipFillPropertiesModel;
import test.ooxml.drawingml.main.CT_ShapePropertiesModel;
import test.ooxml.drawingml.main.CT_ShapeStyleModel;
import test.ooxml.drawingml.main.CT_OfficeArtExtensionListModel;


public class CT_GvmlPictureModel {


    private final CT_GvmlPictureNonVisualModel nvPicPr;
    private final CT_BlipFillPropertiesModel blipFill;
    private final CT_ShapePropertiesModel spPr;
    private final CT_ShapeStyleModel style;
    private final CT_OfficeArtExtensionListModel extLst;

    public CT_GvmlPictureModel(CT_GvmlPictureNonVisualModel nvPicPr, CT_BlipFillPropertiesModel blipFill, CT_ShapePropertiesModel spPr, CT_ShapeStyleModel style, CT_OfficeArtExtensionListModel extLst) {
        this.nvPicPr = nvPicPr;
        this.blipFill = blipFill;
        this.spPr = spPr;
        this.style = style;
        this.extLst = extLst;
    }

    public CT_GvmlPictureNonVisualModel getNvPicPr() {
        return this.nvPicPr;
    }
    public CT_BlipFillPropertiesModel getBlipFill() {
        return this.blipFill;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
    public CT_ShapeStyleModel getStyle() {
        return this.style;
    }
    public CT_OfficeArtExtensionListModel getExtLst() {
        return this.extLst;
    }
}
