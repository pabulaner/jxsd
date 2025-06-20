
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_AdjCoordinateModel;
import test.ooxml.drawingml.main.ST_AdjCoordinateModel;


public class CT_AdjPoint2DModel {


    private final ST_AdjCoordinateModel y;
    private final ST_AdjCoordinateModel x;

    public CT_AdjPoint2DModel(ST_AdjCoordinateModel y, ST_AdjCoordinateModel x) {
        this.y = y;
        this.x = x;
    }

    public ST_AdjCoordinateModel getY() {
        return this.y;
    }
    public ST_AdjCoordinateModel getX() {
        return this.x;
    }
}
