


public class CT_TransformEffectModel {


    private final ST_PercentageModel sy;
    private final ST_FixedAngleModel ky;
    private final ST_PercentageModel sx;
    private final ST_CoordinateModel ty;
    private final ST_FixedAngleModel kx;
    private final ST_CoordinateModel tx;

    public CT_TransformEffectModel(ST_PercentageModel sy , ST_FixedAngleModel ky , ST_PercentageModel sx , ST_CoordinateModel ty , ST_FixedAngleModel kx , ST_CoordinateModel tx ) {
        this.sy = sy;
        this.ky = ky;
        this.sx = sx;
        this.ty = ty;
        this.kx = kx;
        this.tx = tx;
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
    public ST_CoordinateModel getTy() {
        return this.ty;
    }
    public ST_FixedAngleModel getKx() {
        return this.kx;
    }
    public ST_CoordinateModel getTx() {
        return this.tx;
    }
}