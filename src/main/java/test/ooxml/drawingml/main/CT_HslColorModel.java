
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PositiveFixedAngleModel;
import test.ooxml.drawingml.main.ST_PercentageModel;
import test.ooxml.drawingml.main.ST_PercentageModel;


public class CT_HslColorModel {


    private final ST_PositiveFixedAngleModel hue;
    private final ST_PercentageModel lum;
    private final ST_PercentageModel sat;

    public CT_HslColorModel(ST_PositiveFixedAngleModel hue, ST_PercentageModel lum, ST_PercentageModel sat) {
        this.hue = hue;
        this.lum = lum;
        this.sat = sat;
    }

    public ST_PositiveFixedAngleModel getHue() {
        return this.hue;
    }
    public ST_PercentageModel getLum() {
        return this.lum;
    }
    public ST_PercentageModel getSat() {
        return this.sat;
    }
}
