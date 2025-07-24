package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.XMLSchema.BooleanModel;
import com.scell.model.XMLSchema.StringModel;
import com.scell.model.drawingml.chartDrawing.GraphicFrameModel;
import com.scell.model.drawingml.chartDrawing.GraphicFrameNonVisualModel;
import com.scell.model.drawingml.main.GraphicModel;
import com.scell.model.drawingml.main.Transform2DModel;

public class GraphicFrameBuilder {
  private BooleanModel fPublished;

  private StringModel macro;

  private GraphicFrameNonVisualModel nvGraphicFramePr;

  private Transform2DModel xfrm;

  private GraphicModel graphic;

  public GraphicFrameBuilder() {
  }

  public GraphicFrameBuilder setFPublished(BooleanModel fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public GraphicFrameBuilder setMacro(StringModel macro) {
    this.macro = macro;
    return this;
  }

  public GraphicFrameBuilder setNvGraphicFramePr(GraphicFrameNonVisualModel nvGraphicFramePr) {
    this.nvGraphicFramePr = nvGraphicFramePr;
    return this;
  }

  public GraphicFrameBuilder setXfrm(Transform2DModel xfrm) {
    this.xfrm = xfrm;
    return this;
  }

  public GraphicFrameBuilder setGraphic(GraphicModel graphic) {
    this.graphic = graphic;
    return this;
  }

  public GraphicFrameModel build() {
    return new GraphicFrameModel(this.fPublished, this.macro, this.nvGraphicFramePr, this.xfrm, this.graphic);
  }

  public GraphicFrameBuilder from(GraphicFrameModel value) {
    this.fPublished = value.getFPublished();
    this.macro = value.getMacro();
    this.nvGraphicFramePr = value.getNvGraphicFramePr();
    this.xfrm = value.getXfrm();
    this.graphic = value.getGraphic();
    return this;
  }
}
