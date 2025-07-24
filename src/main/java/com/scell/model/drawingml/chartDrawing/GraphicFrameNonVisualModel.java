package com.scell.model.drawingml.chartDrawing;

import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.NonVisualGraphicFramePropertiesModel;

public class GraphicFrameNonVisualModel {
  private final NonVisualDrawingPropsModel cNvPr;

  private final NonVisualGraphicFramePropertiesModel cNvGraphicFramePr;

  public GraphicFrameNonVisualModel(NonVisualDrawingPropsModel cNvPr,
      NonVisualGraphicFramePropertiesModel cNvGraphicFramePr) {
    this.cNvPr = cNvPr;
    this.cNvGraphicFramePr = cNvGraphicFramePr;
  }

  public NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public NonVisualGraphicFramePropertiesModel getCNvGraphicFramePr() {
    return this.cNvGraphicFramePr;
  }
}
