
package test.ooxml.drawingml.diagram;

import test._2001.XMLSchema.DoubleModel;
import test.ooxml.drawingml.diagram.ST_Index1Model;


public class CT_AdjModel {


    private final DoubleModel val;
    private final ST_Index1Model idx;

    public CT_AdjModel(DoubleModel val, ST_Index1Model idx) {
        this.val = val;
        this.idx = idx;
    }

    public DoubleModel getVal() {
        return this.val;
    }
    public ST_Index1Model getIdx() {
        return this.idx;
    }
}
