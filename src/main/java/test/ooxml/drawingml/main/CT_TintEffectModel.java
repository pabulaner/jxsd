
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PositiveFixedAngleModel;
import test.ooxml.drawingml.main.ST_FixedPercentageModel;


public class CT_TintEffectModel {


    private final ST_PositiveFixedAngleModel hue;
    private final ST_FixedPercentageModel amt;

    public CT_TintEffectModel(ST_PositiveFixedAngleModel hue, ST_FixedPercentageModel amt) {
        this.hue = hue;
        this.amt = amt;
    }

    public ST_PositiveFixedAngleModel getHue() {
        return this.hue;
    }
    public ST_FixedPercentageModel getAmt() {
        return this.amt;
    }
}
