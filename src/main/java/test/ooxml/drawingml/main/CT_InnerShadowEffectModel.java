
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PositiveCoordinateModel;
import test.ooxml.drawingml.main.ST_PositiveCoordinateModel;
import test.ooxml.drawingml.main.ST_PositiveFixedAngleModel;


public class CT_InnerShadowEffectModel {


    private final ST_PositiveCoordinateModel blurRad;
    private final ST_PositiveCoordinateModel dist;
    private final ST_PositiveFixedAngleModel dir;

    public CT_InnerShadowEffectModel(ST_PositiveCoordinateModel blurRad, ST_PositiveCoordinateModel dist, ST_PositiveFixedAngleModel dir) {
        this.blurRad = blurRad;
        this.dist = dist;
        this.dir = dir;
    }

    public ST_PositiveCoordinateModel getBlurRad() {
        return this.blurRad;
    }
    public ST_PositiveCoordinateModel getDist() {
        return this.dist;
    }
    public ST_PositiveFixedAngleModel getDir() {
        return this.dir;
    }
}
