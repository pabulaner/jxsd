package model.drawingml.chartDrawing;

import model.drawingml.main.CT_NonVisualDrawingPropsModel;
import model.drawingml.main.CT_NonVisualGraphicFramePropertiesModel;

public class CT_GraphicFrameNonVisualModel {
  private final CT_NonVisualDrawingPropsModel cNvPr;

  private final CT_NonVisualGraphicFramePropertiesModel cNvGraphicFramePr;

  public CT_GraphicFrameNonVisualModel(CT_NonVisualDrawingPropsModel cNvPr,
      CT_NonVisualGraphicFramePropertiesModel cNvGraphicFramePr) {
    this.cNvPr = cNvPr;
    this.cNvGraphicFramePr = cNvGraphicFramePr;
  }

  public CT_NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public CT_NonVisualGraphicFramePropertiesModel getCNvGraphicFramePr() {
    return this.cNvGraphicFramePr;
  }
}
