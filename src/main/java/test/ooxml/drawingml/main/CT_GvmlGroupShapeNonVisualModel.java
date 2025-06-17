
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_NonVisualDrawingPropsModel;
import test.ooxml.drawingml.main.CT_NonVisualGroupDrawingShapePropsModel;


public class CT_GvmlGroupShapeNonVisualModel {


    private final CT_NonVisualDrawingPropsModel cNvPr;
    private final CT_NonVisualGroupDrawingShapePropsModel cNvGrpSpPr;

    public CT_GvmlGroupShapeNonVisualModel(CT_NonVisualDrawingPropsModel cNvPr, CT_NonVisualGroupDrawingShapePropsModel cNvGrpSpPr) {
        this.cNvPr = cNvPr;
        this.cNvGrpSpPr = cNvGrpSpPr;
    }

    public CT_NonVisualDrawingPropsModel getCNvPr() {
        return this.cNvPr;
    }
    public CT_NonVisualGroupDrawingShapePropsModel getCNvGrpSpPr() {
        return this.cNvGrpSpPr;
    }
}
