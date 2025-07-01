package test.drawingml.chartDrawing;

import test.drawingml.main.CTNonVisualDrawingPropsModel;
import test.drawingml.main.CTNonVisualGroupDrawingShapePropsModel;

public class CTGroupShapeNonVisualModel {
  private final CTNonVisualDrawingPropsModel cNvPr;

  private final CTNonVisualGroupDrawingShapePropsModel cNvGrpSpPr;

  public CTGroupShapeNonVisualModel(CTNonVisualDrawingPropsModel cNvPr,
      CTNonVisualGroupDrawingShapePropsModel cNvGrpSpPr) {
    this.cNvPr = cNvPr;
    this.cNvGrpSpPr = cNvGrpSpPr;
  }

  public CTNonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public CTNonVisualGroupDrawingShapePropsModel getCNvGrpSpPr() {
    return this.cNvGrpSpPr;
  }
}
