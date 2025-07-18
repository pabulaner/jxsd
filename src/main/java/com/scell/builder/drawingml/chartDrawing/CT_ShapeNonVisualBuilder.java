package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_ShapeNonVisualModel;
import com.scell.model.drawingml.main.CT_NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.CT_NonVisualDrawingShapePropsModel;

public class CT_ShapeNonVisualBuilder {
  private CT_NonVisualDrawingPropsModel cNvPr;

  private CT_NonVisualDrawingShapePropsModel cNvSpPr;

  public CT_ShapeNonVisualBuilder() {
  }

  public CT_ShapeNonVisualBuilder setCNvPr(CT_NonVisualDrawingPropsModel cNvPr) {
    this.cNvPr = cNvPr;
    return this;
  }

  public CT_ShapeNonVisualBuilder setCNvSpPr(CT_NonVisualDrawingShapePropsModel cNvSpPr) {
    this.cNvSpPr = cNvSpPr;
    return this;
  }

  public CT_ShapeNonVisualModel build() {
    return new CT_ShapeNonVisualModel(this.cNvPr, this.cNvSpPr);
  }

  public CT_ShapeNonVisualBuilder from(CT_ShapeNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvSpPr = value.getCNvSpPr();
    return this;
  }
}
