


public class CT_GeomRectModel {


    private final ST_AdjCoordinateModel l;
    private final ST_AdjCoordinateModel t;
    private final ST_AdjCoordinateModel r;
    private final ST_AdjCoordinateModel b;

    public CT_GeomRectModel(ST_AdjCoordinateModel l , ST_AdjCoordinateModel t , ST_AdjCoordinateModel r , ST_AdjCoordinateModel b ) {
        this.l = l;
        this.t = t;
        this.r = r;
        this.b = b;
    }

    public ST_AdjCoordinateModel getL() {
        return this.l;
    }
    public ST_AdjCoordinateModel getT() {
        return this.t;
    }
    public ST_AdjCoordinateModel getR() {
        return this.r;
    }
    public ST_AdjCoordinateModel getB() {
        return this.b;
    }
}