
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_AdjCoordinateModel;
import test.ooxml.drawingml.main.ST_GeomGuideNameModel;
import test.ooxml.drawingml.main.ST_GeomGuideNameModel;
import test.ooxml.drawingml.main.ST_AdjCoordinateModel;
import test.ooxml.drawingml.main.ST_AdjCoordinateModel;
import test.ooxml.drawingml.main.ST_AdjCoordinateModel;
import test.ooxml.drawingml.main.CT_AdjPoint2DModel;


public class CT_XYAdjustHandleModel {


    private final ST_AdjCoordinateModel maxX;
    private final ST_GeomGuideNameModel gdRefY;
    private final ST_GeomGuideNameModel gdRefX;
    private final ST_AdjCoordinateModel maxY;
    private final ST_AdjCoordinateModel minY;
    private final ST_AdjCoordinateModel minX;
    private final CT_AdjPoint2DModel pos;

    public CT_XYAdjustHandleModel(ST_AdjCoordinateModel maxX, ST_GeomGuideNameModel gdRefY, ST_GeomGuideNameModel gdRefX, ST_AdjCoordinateModel maxY, ST_AdjCoordinateModel minY, ST_AdjCoordinateModel minX, CT_AdjPoint2DModel pos) {
        this.maxX = maxX;
        this.gdRefY = gdRefY;
        this.gdRefX = gdRefX;
        this.maxY = maxY;
        this.minY = minY;
        this.minX = minX;
        this.pos = pos;
    }

    public ST_AdjCoordinateModel getMaxX() {
        return this.maxX;
    }
    public ST_GeomGuideNameModel getGdRefY() {
        return this.gdRefY;
    }
    public ST_GeomGuideNameModel getGdRefX() {
        return this.gdRefX;
    }
    public ST_AdjCoordinateModel getMaxY() {
        return this.maxY;
    }
    public ST_AdjCoordinateModel getMinY() {
        return this.minY;
    }
    public ST_AdjCoordinateModel getMinX() {
        return this.minX;
    }
    public CT_AdjPoint2DModel getPos() {
        return this.pos;
    }
}
