
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_DrawingElementIdModel;
import test._2001.XMLSchema.UnsignedIntModel;


public class CT_ConnectionModel {


    private final ST_DrawingElementIdModel id;
    private final UnsignedIntModel idx;

    public CT_ConnectionModel(ST_DrawingElementIdModel id, UnsignedIntModel idx) {
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
