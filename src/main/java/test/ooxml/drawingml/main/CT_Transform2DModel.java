
package test.ooxml.drawingml.main;

import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.ST_AngleModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.CT_Point2DModel;
import test.ooxml.drawingml.main.CT_PositiveSize2DModel;


public class CT_Transform2DModel {


    private final BooleanModel flipV;
    private final ST_AngleModel rot;
    private final BooleanModel flipH;
    private final CT_Point2DModel off;
    private final CT_PositiveSize2DModel ext;

    public CT_Transform2DModel(BooleanModel flipV, ST_AngleModel rot, BooleanModel flipH, CT_Point2DModel off, CT_PositiveSize2DModel ext) {
        this.flipV = flipV;
        this.rot = rot;
        this.flipH = flipH;
        this.off = off;
        this.ext = ext;
    }

    public BooleanModel getFlipV() {
        return this.flipV;
    }
    public ST_AngleModel getRot() {
        return this.rot;
    }
    public BooleanModel getFlipH() {
        return this.flipH;
    }
    public CT_Point2DModel getOff() {
        return this.off;
    }
    public CT_PositiveSize2DModel getExt() {
        return this.ext;
    }
}
