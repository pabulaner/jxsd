
package test.ooxml.drawingml.chart;

import test._2001.XMLSchema.UnsignedIntModel;
import test.ooxml.officeDocument.sharedTypes.ST_XstringModel;


public class CT_StrValModel {


    private final UnsignedIntModel idx;
    private final ST_XstringModel v;

    public CT_StrValModel(UnsignedIntModel idx, ST_XstringModel v) {
        this.idx = idx;
        this.v = v;
    }

    public UnsignedIntModel getIdx() {
        return this.idx;
    }
    public ST_XstringModel getV() {
        return this.v;
    }
}
