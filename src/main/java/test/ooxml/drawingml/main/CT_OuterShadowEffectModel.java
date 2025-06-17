
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PositiveCoordinateModel;
import test.ooxml.drawingml.main.ST_PositiveCoordinateModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.ST_PercentageModel;
import test.ooxml.drawingml.main.ST_FixedAngleModel;
import test.ooxml.drawingml.main.ST_PercentageModel;
import test.ooxml.drawingml.main.ST_FixedAngleModel;
import test.ooxml.drawingml.main.ST_PositiveFixedAngleModel;
import test.ooxml.drawingml.main.ST_RectAlignmentModel;


public class CT_OuterShadowEffectModel {


    private final ST_PositiveCoordinateModel blurRad;
    private final ST_PositiveCoordinateModel dist;
    private final BooleanModel rotWithShape;
    private final ST_PercentageModel sy;
    private final ST_FixedAngleModel ky;
    private final ST_PercentageModel sx;
    private final ST_FixedAngleModel kx;
    private final ST_PositiveFixedAngleModel dir;
    private final ST_RectAlignmentModel algn;

    public CT_OuterShadowEffectModel(ST_PositiveCoordinateModel blurRad, ST_PositiveCoordinateModel dist, BooleanModel rotWithShape, ST_PercentageModel sy, ST_FixedAngleModel ky, ST_PercentageModel sx, ST_FixedAngleModel kx, ST_PositiveFixedAngleModel dir, ST_RectAlignmentModel algn) {
        this.blurRad = blurRad;
        this.dist = dist;
        this.rotWithShape = rotWithShape;
        this.sy = sy;
        this.ky = ky;
        this.sx = sx;
        this.kx = kx;
        this.dir = dir;
        this.algn = algn;
    }

    public ST_PositiveCoordinateModel getBlurRad() {
        return this.blurRad;
    }
    public ST_PositiveCoordinateModel getDist() {
        return this.dist;
    }
    public BooleanModel getRotWithShape() {
        return this.rotWithShape;
    }
    public ST_PercentageModel getSy() {
        return this.sy;
    }
    public ST_FixedAngleModel getKy() {
        return this.ky;
    }
    public ST_PercentageModel getSx() {
        return this.sx;
    }
    public ST_FixedAngleModel getKx() {
        return this.kx;
    }
    public ST_PositiveFixedAngleModel getDir() {
        return this.dir;
    }
    public ST_RectAlignmentModel getAlgn() {
        return this.algn;
    }
}
