package com.scell.model.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.CT_GraphicalObjectModel;
import com.scell.model.drawingml.main.CT_Transform2DModel;

public class CT_GraphicFrameModel {
  private final BooleanModel fPublished;

  private final StringModel macro;

  private final CT_GraphicFrameNonVisualModel nvGraphicFramePr;

  private final CT_Transform2DModel xfrm;

  private final CT_GraphicalObjectModel graphic;

  public CT_GraphicFrameModel(BooleanModel fPublished, StringModel macro,
      CT_GraphicFrameNonVisualModel nvGraphicFramePr, CT_Transform2DModel xfrm,
      CT_GraphicalObjectModel graphic) {
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
