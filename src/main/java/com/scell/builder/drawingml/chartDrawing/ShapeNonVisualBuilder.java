package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.ShapeNonVisualModel;
import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.NonVisualDrawingShapePropsModel;

public class ShapeNonVisualBuilder {
  private NonVisualDrawingPropsModel cNvPr;

  private NonVisualDrawingShapePropsModel cNvSpPr;

  public ShapeNonVisualBuilder() {
  }

  public ShapeNonVisualBuilder setCNvPr(NonVisualDrawingPropsModel cNvPr) {
    this.cNvPr = cNvPr;
    return this;
  }

  public ShapeNonVisualBuilder setCNvSpPr(NonVisualDrawingShapePropsModel cNvSpPr) {
    this.cNvSpPr = cNvSpPr;
    return this;
  }

  public ShapeNonVisualModel build() {
    return new ShapeNonVisualModel(this.cNvPr, this.cNvSpPr);
  }

  public ShapeNonVisualBuilder from(ShapeNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvSpPr = value.getCNvSpPr();
    return this;
  }
}
