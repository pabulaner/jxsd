
package test.ooxml.drawingml.chartDrawing;

import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.chartDrawing.CT_PictureNonVisualModel;
import test.ooxml.drawingml.main.CT_BlipFillPropertiesModel;
import test.ooxml.drawingml.main.CT_ShapePropertiesModel;
import test.ooxml.drawingml.main.CT_ShapeStyleModel;


public class CT_PictureModel {


    private final BooleanModel fPublished;
    private final StringModel macro;
    private final CT_PictureNonVisualModel nvPicPr;
    private final CT_BlipFillPropertiesModel blipFill;
    private final CT_ShapePropertiesModel spPr;
    private final CT_ShapeStyleModel style;

    public CT_PictureModel(BooleanModel fPublished, StringModel macro, CT_PictureNonVisualModel nvPicPr, CT_BlipFillPropertiesModel blipFill, CT_ShapePropertiesModel spPr, CT_ShapeStyleModel style) {
        this.fPublished = fPublished;
        this.macro = macro;
        this.nvPicPr = nvPicPr;
        this.blipFill = blipFill;
        this.spPr = spPr;
        this.style = style;
    }

    public BooleanModel getFPublished() {
        return this.fPublished;
    }
    public StringModel getMacro() {
        return this.macro;
    }
    public CT_PictureNonVisualModel getNvPicPr() {
        return this.nvPicPr;
    }
    public CT_BlipFillPropertiesModel getBlipFill() {
        return this.blipFill;
    }
    public CT_ShapePropertiesModel getSpPr() {
        return this.spPr;
    }
    public CT_ShapeStyleModel getStyle() {
        return this.style;
    }
}
