
package test.ooxml.drawingml.chartDrawing;

import test.ooxml.drawingml.main.CT_NonVisualDrawingPropsModel;
import test.ooxml.drawingml.main.CT_NonVisualPicturePropertiesModel;


public class CT_PictureNonVisualModel {


    private final CT_NonVisualDrawingPropsModel cNvPr;
    private final CT_NonVisualPicturePropertiesModel cNvPicPr;

    public CT_PictureNonVisualModel(CT_NonVisualDrawingPropsModel cNvPr, CT_NonVisualPicturePropertiesModel cNvPicPr) {
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
