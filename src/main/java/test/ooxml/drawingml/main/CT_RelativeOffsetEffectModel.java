
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PercentageModel;
import test.ooxml.drawingml.main.ST_PercentageModel;


public class CT_RelativeOffsetEffectModel {


    private final ST_PercentageModel ty;
    private final ST_PercentageModel tx;

    public CT_RelativeOffsetEffectModel(ST_PercentageModel ty, ST_PercentageModel tx) {
        this.ty = ty;
        this.tx = tx;
    }

    public ST_PercentageModel getTy() {
        return this.ty;
    }
    public ST_PercentageModel getTx() {
        return this.tx;
    }
}
