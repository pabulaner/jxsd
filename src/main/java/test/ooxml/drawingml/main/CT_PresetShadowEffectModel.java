
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PositiveCoordinateModel;
import test.ooxml.drawingml.main.ST_PresetShadowValModel;
import test.ooxml.drawingml.main.ST_PositiveFixedAngleModel;


public class CT_PresetShadowEffectModel {


    private final ST_PositiveCoordinateModel dist;
    private final ST_PresetShadowValModel prst;
    private final ST_PositiveFixedAngleModel dir;

    public CT_PresetShadowEffectModel(ST_PositiveCoordinateModel dist, ST_PresetShadowValModel prst, ST_PositiveFixedAngleModel dir) {
        this.dist = dist;
        this.prst = prst;
        this.dir = dir;
    }

    public ST_PositiveCoordinateModel getDist() {
        return this.dist;
    }
    public ST_PresetShadowValModel getPrst() {
        return this.prst;
    }
    public ST_PositiveFixedAngleModel getDir() {
        return this.dir;
    }
}
