
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PercentageModel;
import test.ooxml.drawingml.main.ST_PercentageModel;
import test.ooxml.drawingml.main.ST_PercentageModel;
import test.ooxml.drawingml.main.ST_PercentageModel;


public class CT_RelativeRectModel {


    private final ST_PercentageModel l;
    private final ST_PercentageModel t;
    private final ST_PercentageModel r;
    private final ST_PercentageModel b;

    public CT_RelativeRectModel(ST_PercentageModel l, ST_PercentageModel t, ST_PercentageModel r, ST_PercentageModel b) {
        this.l = l;
        this.t = t;
        this.r = r;
        this.b = b;
    }

    public ST_PercentageModel getL() {
        return this.l;
    }
    public ST_PercentageModel getT() {
        return this.t;
    }
    public ST_PercentageModel getR() {
        return this.r;
    }
    public ST_PercentageModel getB() {
        return this.b;
    }
}
