
package test.ooxml.drawingml.chartDrawing;

import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.chartDrawing.CT_ConnectorNonVisualModel;
import test.ooxml.drawingml.main.CT_ShapePropertiesModel;
import test.ooxml.drawingml.main.CT_ShapeStyleModel;


public class CT_ConnectorModel {


    private final BooleanModel fPublished;
    private final StringModel macro;
    private final CT_ConnectorNonVisualModel nvCxnSpPr;
    private final CT_ShapePropertiesModel spPr;
    private final CT_ShapeStyleModel style;

    public CT_ConnectorModel(BooleanModel fPublished, StringModel macro, CT_ConnectorNonVisualModel nvCxnSpPr, CT_ShapePropertiesModel spPr, CT_ShapeStyleModel style) {
        this.fPublished = fPublished;
        this.macro = macro;
        this.nvCxnSpPr = nvCxnSpPr;
        this.spPr = spPr;
        this.style = style;
    }

    public BooleanModel getFPublished() {
        return this.fPublished;
    }
    public StringModel getMacro() {
        return this.macro;
    }
    public CT_ConnectorNonVisualModel getNvCxnSpPr() {
        return this.nvCxnSpPr;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
    public CT_ShapeStyleModel getStyle() {
        return this.style;
    }
}
