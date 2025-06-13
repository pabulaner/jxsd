


public class CT_GroupTransform2DModel {


    private final BooleanModel flipV;
    private final ST_AngleModel rot;
    private final BooleanModel flipH;
    private final CT_Point2DModel off;
    private final CT_PositiveSize2DModel ext;
    private final CT_Point2DModel chOff;
    private final CT_PositiveSize2DModel chExt;

    public CT_GroupTransform2DModel(BooleanModel flipV , ST_AngleModel rot , BooleanModel flipH , CT_Point2DModel off , CT_PositiveSize2DModel ext , CT_Point2DModel chOff , CT_PositiveSize2DModel chExt ) {
        this.flipV = flipV;
        this.rot = rot;
        this.flipH = flipH;
        this.off = off;
        this.ext = ext;
        this.chOff = chOff;
        this.chExt = chExt;
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
    public CT_Point2DModel getChOff() {
        return this.chOff;
    }
    public CT_PositiveSize2DModel getChExt() {
        return this.chExt;
    }
}