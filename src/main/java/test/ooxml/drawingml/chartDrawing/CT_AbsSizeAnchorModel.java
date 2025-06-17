
package test.ooxml.drawingml.chartDrawing;

import test.ooxml.drawingml.chartDrawing.CT_MarkerModel;
import test.ooxml.drawingml.main.CT_PositiveSize2DModel;


public class CT_AbsSizeAnchorModel {


    private final CT_MarkerModel from;
    private final CT_PositiveSize2DModel ext;

    public CT_AbsSizeAnchorModel(CT_MarkerModel from, CT_PositiveSize2DModel ext) {
        this.from = from;
        this.ext = ext;
    }

    public CT_MarkerModel getFrom() {
        return this.from;
    }
    public CT_PositiveSize2DModel getExt() {
        return this.ext;
    }
}
