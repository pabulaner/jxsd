
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.CT_ColorModel;
import test.ooxml.drawingml.main.CT_ColorModel;


public class CT_ColorChangeEffectModel {


    private final BooleanModel useA;
    private final CT_ColorModel clrFrom;
    private final CT_ColorModel clrTo;

    public CT_ColorChangeEffectModel(BooleanModel useA, CT_ColorModel clrFrom, CT_ColorModel clrTo) {
        this.useA = useA;
        this.clrFrom = clrFrom;
        this.clrTo = clrTo;
    }

    public BooleanModel getUseA() {
        return this.useA;
    }
    public CT_ColorModel getClrFrom() {
        return this.clrFrom;
    }
    public CT_ColorModel getClrTo() {
        return this.clrTo;
    }
}
