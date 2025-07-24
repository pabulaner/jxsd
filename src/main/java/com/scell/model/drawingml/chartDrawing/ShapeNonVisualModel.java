package com.scell.model.drawingml.chartDrawing;

import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.NonVisualDrawingShapePropsModel;

public class ShapeNonVisualModel {
  private final NonVisualDrawingPropsModel cNvPr;

  private final NonVisualDrawingShapePropsModel cNvSpPr;

  public ShapeNonVisualModel(NonVisualDrawingPropsModel cNvPr,
      NonVisualDrawingShapePropsModel cNvSpPr) {
    this.cNvPr = cNvPr;
    this.cNvSpPr = cNvSpPr;
  }

  public NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public NonVisualDrawingShapePropsModel getCNvSpPr() {
    return this.cNvSpPr;
  }
}
