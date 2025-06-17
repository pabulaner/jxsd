
package test.ooxml.drawingml.chartDrawing;

import test._2001.XMLSchema.BooleanModel;
import test._2001.XMLSchema.StringModel;
import test.ooxml.drawingml.chartDrawing.CT_GraphicFrameNonVisualModel;
import test.ooxml.drawingml.main.CT_Transform2DModel;
import test.ooxml.drawingml.main.CT_GraphicalObjectModel;


public class CT_GraphicFrameModel {


    private final BooleanModel fPublished;
    private final StringModel macro;
    private final CT_GraphicFrameNonVisualModel nvGraphicFramePr;
    private final CT_Transform2DModel xfrm;
    private final CT_GraphicalObjectModel graphic;

    public CT_GraphicFrameModel(BooleanModel fPublished, StringModel macro, CT_GraphicFrameNonVisualModel nvGraphicFramePr, CT_Transform2DModel xfrm, CT_GraphicalObjectModel graphic) {
        this.fPublished = fPublished;
        this.macro = macro;
        this.nvGraphicFramePr = nvGraphicFramePr;
        this.xfrm = xfrm;
        this.graphic = graphic;
    }

    public BooleanModel getFPublished() {
        return this.fPublished;
    }
    public StringModel getMacro() {
        return this.macro;
    }
    public CT_GraphicFrameNonVisualModel getNvGraphicFramePr() {
        return this.nvGraphicFramePr;
    }
    public CT_Transform2DModel getXfrm() {
        return this.xfrm;
    }
    public CT_GraphicalObjectModel getGraphic() {
        return this.graphic;
    }
}
