package com.scell.model.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanValueModel;
import com.scell.model.XMLSchema.StringValueModel;
import com.scell.model.drawingml.main.GraphicValueModel;
import com.scell.model.drawingml.main.Transform2DModel;

public class GraphicFrameModel {
  private final BooleanValueModel fPublished;

  private final StringValueModel macro;

  private final GraphicFrameNonVisualModel nvGraphicFramePr;

  private final Transform2DModel xfrm;

  private final GraphicValueModel graphic;

  public GraphicFrameModel(BooleanValueModel fPublished, StringValueModel macro,
      GraphicFrameNonVisualModel nvGraphicFramePr, Transform2DModel xfrm,
      GraphicValueModel graphic) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvGraphicFramePr = nvGraphicFramePr;
    this.xfrm = xfrm;
    this.graphic = graphic;
  }

  public BooleanValueModel getFPublished() {
    return this.fPublished;
  }

  public StringValueModel getMacro() {
    return this.macro;
  }

  public GraphicFrameNonVisualModel getNvGraphicFramePr() {
    return this.nvGraphicFramePr;
  }

  public Transform2DModel getXfrm() {
    return this.xfrm;
  }

  public GraphicValueModel getGraphic() {
    return this.graphic;
  }
}
