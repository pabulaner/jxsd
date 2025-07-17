package model.drawingml.chartDrawing;

import model.XMLSchema.booleanModel;
import model.XMLSchema.stringModel;
import model.drawingml.main.CT_GraphicalObjectModel;
import model.drawingml.main.CT_Transform2DModel;

public class CT_GraphicFrameModel {
  private final booleanModel fPublished;

  private final stringModel macro;

  private final CT_GraphicFrameNonVisualModel nvGraphicFramePr;

  private final CT_Transform2DModel xfrm;

  private final CT_GraphicalObjectModel graphic;

  public CT_GraphicFrameModel(booleanModel fPublished, stringModel macro,
      CT_GraphicFrameNonVisualModel nvGraphicFramePr, CT_Transform2DModel xfrm,
      CT_GraphicalObjectModel graphic) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvGraphicFramePr = nvGraphicFramePr;
    this.xfrm = xfrm;
    this.graphic = graphic;
  }

  public booleanModel getFPublished() {
    return this.fPublished;
  }

  public stringModel getMacro() {
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
