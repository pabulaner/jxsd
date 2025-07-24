package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.GraphicFrameNonVisualModel;
import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.NonVisualGraphicFramePropertiesModel;

public class GraphicFrameNonVisualBuilder {
  private NonVisualDrawingPropsModel cNvPr;

  private NonVisualGraphicFramePropertiesModel cNvGraphicFramePr;

  public GraphicFrameNonVisualBuilder() {
  }

  public GraphicFrameNonVisualBuilder setCNvPr(NonVisualDrawingPropsModel cNvPr) {
    this.cNvPr = cNvPr;
    return this;
  }

  public GraphicFrameNonVisualBuilder setCNvGraphicFramePr(
      NonVisualGraphicFramePropertiesModel cNvGraphicFramePr) {
    this.cNvGraphicFramePr = cNvGraphicFramePr;
    return this;
  }

  public GraphicFrameNonVisualModel build() {
    return new GraphicFrameNonVisualModel(this.cNvPr, this.cNvGraphicFramePr);
  }

  public GraphicFrameNonVisualBuilder from(GraphicFrameNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvGraphicFramePr = value.getCNvGraphicFramePr();
    return this;
  }
}
