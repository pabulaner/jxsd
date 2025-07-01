package test.drawingml.chartDrawing;

import test.drawingml.main.CTNonVisualDrawingPropsModel;
import test.drawingml.main.CTNonVisualGraphicFramePropertiesModel;

public class CTGraphicFrameNonVisualModel {
  private final CTNonVisualDrawingPropsModel cNvPr;

  private final CTNonVisualGraphicFramePropertiesModel cNvGraphicFramePr;

  public CTGraphicFrameNonVisualModel(CTNonVisualDrawingPropsModel cNvPr,
      CTNonVisualGraphicFramePropertiesModel cNvGraphicFramePr) {
    this.cNvPr = cNvPr;
    this.cNvGraphicFramePr = cNvGraphicFramePr;
  }

  public CTNonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public CTNonVisualGraphicFramePropertiesModel getCNvGraphicFramePr() {
    return this.cNvGraphicFramePr;
  }
}
