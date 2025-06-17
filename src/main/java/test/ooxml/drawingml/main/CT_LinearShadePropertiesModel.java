
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.ST_PositiveFixedAngleModel;


public class CT_LinearShadePropertiesModel {


    private final BooleanModel scaled;
    private final ST_PositiveFixedAngleModel ang;

    public CT_LinearShadePropertiesModel(BooleanModel scaled, ST_PositiveFixedAngleModel ang) {
        this.scaled = scaled;
        this.ang = ang;
    }

    public BooleanModel getScaled() {
        return this.scaled;
    }
    public ST_PositiveFixedAngleModel getAng() {
        return this.ang;
    }
}
