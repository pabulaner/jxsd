
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.CT_StyleMatrixReferenceModel;
import test.ooxml.drawingml.main.CT_StyleMatrixReferenceModel;
import test.ooxml.drawingml.main.CT_StyleMatrixReferenceModel;
import test.ooxml.drawingml.main.CT_FontReferenceModel;


public class CT_ShapeStyleModel {


    private final CT_StyleMatrixReferenceModel lnRef;
    private final CT_StyleMatrixReferenceModel fillRef;
    private final CT_StyleMatrixReferenceModel effectRef;
    private final CT_FontReferenceModel fontRef;

    public CT_ShapeStyleModel(CT_StyleMatrixReferenceModel lnRef, CT_StyleMatrixReferenceModel fillRef, CT_StyleMatrixReferenceModel effectRef, CT_FontReferenceModel fontRef) {
        this.lnRef = lnRef;
        this.fillRef = fillRef;
        this.effectRef = effectRef;
        this.fontRef = fontRef;
    }

    public CT_StyleMatrixReferenceModel getLnRef() {
        return this.lnRef;
    }
    public CT_StyleMatrixReferenceModel getFillRef() {
        return this.fillRef;
    }
    public CT_StyleMatrixReferenceModel getEffectRef() {
        return this.effectRef;
    }
    public CT_FontReferenceModel getFontRef() {
        return this.fontRef;
    }
}
