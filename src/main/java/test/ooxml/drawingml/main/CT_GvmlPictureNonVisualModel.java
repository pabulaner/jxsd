
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_NonVisualDrawingPropsModel;
import test.ooxml.drawingml.main.CT_NonVisualPicturePropertiesModel;


public class CT_GvmlPictureNonVisualModel {


    private final CT_NonVisualDrawingPropsModel cNvPr;
    private final CT_NonVisualPicturePropertiesModel cNvPicPr;

    public CT_GvmlPictureNonVisualModel(CT_NonVisualDrawingPropsModel cNvPr, CT_NonVisualPicturePropertiesModel cNvPicPr) {
        this.cNvPr = cNvPr;
        this.cNvPicPr = cNvPicPr;
    }

    public CT_NonVisualDrawingPropsModel getCNvPr() {
        return this.cNvPr;
    }
    public CT_NonVisualPicturePropertiesModel getCNvPicPr() {
        return this.cNvPicPr;
    }
}
