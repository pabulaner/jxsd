package test.drawingml.chartDrawing;

import test.drawingml.main.CTNonVisualDrawingPropsModel;
import test.drawingml.main.CTNonVisualDrawingShapePropsModel;

public class CTShapeNonVisualModel {
  private final CTNonVisualDrawingPropsModel cNvPr;

  private final CTNonVisualDrawingShapePropsModel cNvSpPr;

  public CTShapeNonVisualModel(CTNonVisualDrawingPropsModel cNvPr,
      CTNonVisualDrawingShapePropsModel cNvSpPr) {
    this.cNvPr = cNvPr;
    this.cNvSpPr = cNvSpPr;
  }

  public CTNonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public CTNonVisualDrawingShapePropsModel getCNvSpPr() {
    return this.cNvSpPr;
  }
}
