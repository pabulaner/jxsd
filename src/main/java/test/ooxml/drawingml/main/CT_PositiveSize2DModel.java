
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PositiveCoordinateModel;
import test.ooxml.drawingml.main.ST_PositiveCoordinateModel;


public class CT_PositiveSize2DModel {


    private final ST_PositiveCoordinateModel cy;
    private final ST_PositiveCoordinateModel cx;

    public CT_PositiveSize2DModel(ST_PositiveCoordinateModel cy, ST_PositiveCoordinateModel cx) {
        this.cy = cy;
        this.cx = cx;
    }

    public ST_PositiveCoordinateModel getCy() {
        return this.cy;
    }
    public ST_PositiveCoordinateModel getCx() {
        return this.cx;
    }
}
