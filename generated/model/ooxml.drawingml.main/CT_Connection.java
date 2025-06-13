


public class CT_ConnectionModel {


    private final ST_DrawingElementIdModel id;
    private final UnsignedIntModel idx;

    public CT_ConnectionModel(ST_DrawingElementIdModel id , UnsignedIntModel idx ) {
        this.id = id;
        this.idx = idx;
    }

    public ST_DrawingElementIdModel getId() {
        return this.id;
    }
    public UnsignedIntModel getIdx() {
        return this.idx;
    }
}