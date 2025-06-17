
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_Coordinate32Model;
import test.ooxml.drawingml.main.ST_TextTabAlignTypeModel;


public class CT_TextTabStopModel {


    private final ST_Coordinate32Model pos;
    private final ST_TextTabAlignTypeModel algn;

    public CT_TextTabStopModel(ST_Coordinate32Model pos, ST_TextTabAlignTypeModel algn) {
        this.pos = pos;
        this.algn = algn;
    }

    public ST_Coordinate32Model getPos() {
        return this.pos;
    }
    public ST_TextTabAlignTypeModel getAlgn() {
        return this.algn;
    }
}
