
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PositivePercentageModel;
import test.ooxml.drawingml.main.ST_PositivePercentageModel;


public class CT_DashStopModel {


    private final ST_PositivePercentageModel sp;
    private final ST_PositivePercentageModel d;

    public CT_DashStopModel(ST_PositivePercentageModel sp, ST_PositivePercentageModel d) {
        this.sp = sp;
        this.d = d;
    }

    public ST_PositivePercentageModel getSp() {
        return this.sp;
    }
    public ST_PositivePercentageModel getD() {
        return this.d;
    }
}
