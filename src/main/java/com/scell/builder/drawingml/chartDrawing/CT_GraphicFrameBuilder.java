package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chartDrawing.CT_GraphicFrameModel;
import com.scell.model.drawingml.chartDrawing.CT_GraphicFrameNonVisualModel;
import com.scell.model.drawingml.main.CT_GraphicalObjectModel;
import com.scell.model.drawingml.main.CT_Transform2DModel;

public class CT_GraphicFrameBuilder {
  private BooleanModel fPublished;

  private StringModel macro;

  private CT_GraphicFrameNonVisualModel nvGraphicFramePr;

  private CT_Transform2DModel xfrm;

  private CT_GraphicalObjectModel graphic;

  public CT_GraphicFrameBuilder() {
  }

  public CT_GraphicFrameBuilder setFPublished(BooleanModel fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public CT_GraphicFrameBuilder setMacro(StringModel macro) {
    this.macro = macro;
    return this;
  }

  public CT_GraphicFrameBuilder setNvGraphicFramePr(
      CT_GraphicFrameNonVisualModel nvGraphicFramePr) {
    this.nvGraphicFramePr = nvGraphicFramePr;
    return this;
  }

  public CT_GraphicFrameBuilder setXfrm(CT_Transform2DModel xfrm) {
    this.xfrm = xfrm;
    return this;
  }

  public CT_GraphicFrameBuilder setGraphic(CT_GraphicalObjectModel graphic) {
    this.graphic = graphic;
    return this;
  }

  public CT_GraphicFrameModel build() {
    return new CT_GraphicFrameModel(this.fPublished, this.macro, this.nvGraphicFramePr, this.xfrm, this.graphic);
  }

  public CT_GraphicFrameBuilder from(CT_GraphicFrameModel value) {
    this.fPublished = value.getFPublished();
    this.macro = value.getMacro();
    this.nvGraphicFramePr = value.getNvGraphicFramePr();
    this.xfrm = value.getXfrm();
    this.graphic = value.getGraphic();
    return this;
  }
}
