
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PositiveFixedAngleModel;
import test.ooxml.drawingml.main.ST_FixedPercentageModel;
import test.ooxml.drawingml.main.ST_FixedPercentageModel;


public class CT_HSLEffectModel {


    private final ST_PositiveFixedAngleModel hue;
    private final ST_FixedPercentageModel lum;
    private final ST_FixedPercentageModel sat;

    public CT_HSLEffectModel(ST_PositiveFixedAngleModel hue, ST_FixedPercentageModel lum, ST_FixedPercentageModel sat) {
        this.hue = hue;
        this.lum = lum;
        this.sat = sat;
    }

    public ST_PositiveFixedAngleModel getHue() {
        return this.hue;
    }
    public ST_FixedPercentageModel getLum() {
        return this.lum;
    }
    public ST_FixedPercentageModel getSat() {
        return this.sat;
    }
}
