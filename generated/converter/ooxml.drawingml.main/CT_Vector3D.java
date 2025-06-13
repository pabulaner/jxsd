


public class CT_Vector3DModel {


    private final ST_CoordinateModel dz;
    private final ST_CoordinateModel dy;
    private final ST_CoordinateModel dx;

    public CT_Vector3DModel(ST_CoordinateModel dz , ST_CoordinateModel dy , ST_CoordinateModel dx ) {
        this.dz = dz;
        this.dy = dy;
        this.dx = dx;
    }

    public ST_CoordinateModel getDz() {
        return this.dz;
    }
    public ST_CoordinateModel getDy() {
        return this.dy;
    }
    public ST_CoordinateModel getDx() {
        return this.dx;
    }
}