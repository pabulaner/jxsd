package com.scell.model.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.main.GraphicModel;
import com.scell.model.drawingml.main.Transform2DModel;

public class GraphicFrameModel {
  private final BooleanModel fPublished;

  private final StringModel macro;

  private final GraphicFrameNonVisualModel nvGraphicFramePr;

  private final Transform2DModel xfrm;

  private final GraphicModel graphic;

  public GraphicFrameModel(BooleanModel fPublished, StringModel macro,
      GraphicFrameNonVisualModel nvGraphicFramePr, Transform2DModel xfrm, GraphicModel graphic) {
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

  public GraphicFrameNonVisualModel getNvGraphicFramePr() {
    return this.nvGraphicFramePr;
  }

  public Transform2DModel getXfrm() {
    return this.xfrm;
  }

  public GraphicModel getGraphic() {
    return this.graphic;
  }
}
