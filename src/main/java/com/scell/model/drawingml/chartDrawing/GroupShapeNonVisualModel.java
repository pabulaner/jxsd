package com.scell.model.drawingml.chartDrawing;

import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.NonVisualGroupDrawingShapePropsModel;

public class GroupShapeNonVisualModel {
  private final NonVisualDrawingPropsModel cNvPr;

  private final NonVisualGroupDrawingShapePropsModel cNvGrpSpPr;

  public GroupShapeNonVisualModel(NonVisualDrawingPropsModel cNvPr,
      NonVisualGroupDrawingShapePropsModel cNvGrpSpPr) {
    this.cNvPr = cNvPr;
    this.cNvGrpSpPr = cNvGrpSpPr;
  }

  public NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public NonVisualGroupDrawingShapePropsModel getCNvGrpSpPr() {
    return this.cNvGrpSpPr;
  }
}
