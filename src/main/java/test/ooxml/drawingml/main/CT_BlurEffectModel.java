
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PositiveCoordinateModel;
import test._2001.XMLSchema.BooleanModel;


public class CT_BlurEffectModel {


    private final ST_PositiveCoordinateModel rad;
    private final BooleanModel grow;

    public CT_BlurEffectModel(ST_PositiveCoordinateModel rad, BooleanModel grow) {
        this.rad = rad;
        this.grow = grow;
    }

    public ST_PositiveCoordinateModel getRad() {
        return this.rad;
    }
    public BooleanModel getGrow() {
        return this.grow;
    }
}
