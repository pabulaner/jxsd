
package test.ooxml.drawingml.main;

import test.ooxml.drawingml.main.ST_PathFillModeModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.ST_PositiveCoordinateModel;
import test.ooxml.drawingml.main.ST_PositiveCoordinateModel;
import test._2001.XMLSchema.BooleanModel;
import test.ooxml.drawingml.main.CT_Path2DCloseModel;
import test.ooxml.drawingml.main.CT_Path2DMoveToModel;
import test.ooxml.drawingml.main.CT_Path2DLineToModel;
import test.ooxml.drawingml.main.CT_Path2DArcToModel;
import test.ooxml.drawingml.main.CT_Path2DQuadBezierToModel;
import test.ooxml.drawingml.main.CT_Path2DCubicBezierToModel;


public class CT_Path2DModel {

public class CloseOrmoveToOrlnToModel {


    private final Object value;

    public CloseOrmoveToOrlnToModel(CT_Path2DCloseModel value) {
        this.value = value;
    }
    public CloseOrmoveToOrlnToModel(CT_Path2DMoveToModel value) {
        this.value = value;
    }
    public CloseOrmoveToOrlnToModel(CT_Path2DLineToModel value) {
        this.value = value;
    }
    public CloseOrmoveToOrlnToModel(CT_Path2DArcToModel value) {
        this.value = value;
    }
    public CloseOrmoveToOrlnToModel(CT_Path2DQuadBezierToModel value) {
        this.value = value;
    }
    public CloseOrmoveToOrlnToModel(CT_Path2DCubicBezierToModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public CT_Path2DCloseModel getClose() {
        return (CT_Path2DCloseModel) value;
    }
    public CT_Path2DMoveToModel getMoveTo() {
        return (CT_Path2DMoveToModel) value;
    }
    public CT_Path2DLineToModel getLnTo() {
        return (CT_Path2DLineToModel) value;
    }
    public CT_Path2DArcToModel getArcTo() {
        return (CT_Path2DArcToModel) value;
    }
    public CT_Path2DQuadBezierToModel getQuadBezTo() {
        return (CT_Path2DQuadBezierToModel) value;
    }
    public CT_Path2DCubicBezierToModel getCubicBezTo() {
        return (CT_Path2DCubicBezierToModel) value;
    }
}

    private final ST_PathFillModeModel fill;
    private final BooleanModel extrusionOk;
    private final ST_PositiveCoordinateModel h;
    private final ST_PositiveCoordinateModel w;
    private final BooleanModel stroke;
    private final CloseOrmoveToOrlnToModel closeOrmoveToOrlnTo;

    public CT_Path2DModel(ST_PathFillModeModel fill, BooleanModel extrusionOk, ST_PositiveCoordinateModel h, ST_PositiveCoordinateModel w, BooleanModel stroke, CloseOrmoveToOrlnToModel closeOrmoveToOrlnTo) {
        this.fill = fill;
        this.extrusionOk = extrusionOk;
        this.h = h;
        this.w = w;
        this.stroke = stroke;
        this.closeOrmoveToOrlnTo = closeOrmoveToOrlnTo;
    }

    public ST_PathFillModeModel getFill() {
        return this.fill;
    }
    public BooleanModel getExtrusionOk() {
        return this.extrusionOk;
    }
    public ST_PositiveCoordinateModel getH() {
        return this.h;
    }
    public ST_PositiveCoordinateModel getW() {
        return this.w;
    }
    public BooleanModel getStroke() {
        return this.stroke;
    }
    public CloseOrmoveToOrlnToModel getCloseOrmoveToOrlnTo() {
        return this.closeOrmoveToOrlnTo;
    }
}
