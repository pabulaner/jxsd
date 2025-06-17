
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_FixedPercentageModel;
import test.ooxml.drawingml.main.ST_FixedPercentageModel;


public class CT_LuminanceEffectModel {


    private final ST_FixedPercentageModel contrast;
    private final ST_FixedPercentageModel bright;

    public CT_LuminanceEffectModel(ST_FixedPercentageModel contrast, ST_FixedPercentageModel bright) {
        this.contrast = contrast;
        this.bright = bright;
    }

    public ST_FixedPercentageModel getContrast() {
        return this.contrast;
    }
    public ST_FixedPercentageModel getBright() {
        return this.bright;
    }
}
