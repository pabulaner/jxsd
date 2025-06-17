
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_CoordinateModel;
import test.ooxml.drawingml.main.ST_CoordinateModel;


public class CT_Point2DModel {


    private final ST_CoordinateModel y;
    private final ST_CoordinateModel x;

    public CT_Point2DModel(ST_CoordinateModel y, ST_CoordinateModel x) {
        this.y = y;
        this.x = x;
    }

    public ST_CoordinateModel getY() {
        return this.y;
    }
    public ST_CoordinateModel getX() {
        return this.x;
    }
}
