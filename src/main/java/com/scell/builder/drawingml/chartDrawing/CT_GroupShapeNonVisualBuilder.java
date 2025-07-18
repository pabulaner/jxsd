package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_GroupShapeNonVisualModel;
import com.scell.model.drawingml.main.CT_NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.CT_NonVisualGroupDrawingShapePropsModel;

public class CT_GroupShapeNonVisualBuilder {
  private CT_NonVisualDrawingPropsModel cNvPr;

  private CT_NonVisualGroupDrawingShapePropsModel cNvGrpSpPr;

  public CT_GroupShapeNonVisualBuilder() {
  }

  public CT_GroupShapeNonVisualBuilder setCNvPr(CT_NonVisualDrawingPropsModel cNvPr) {
    this.cNvPr = cNvPr;
    return this;
  }

  public CT_GroupShapeNonVisualBuilder setCNvGrpSpPr(
      CT_NonVisualGroupDrawingShapePropsModel cNvGrpSpPr) {
    this.cNvGrpSpPr = cNvGrpSpPr;
    return this;
  }

  public CT_GroupShapeNonVisualModel build() {
    return new CT_GroupShapeNonVisualModel(this.cNvPr, this.cNvGrpSpPr);
  }

  public CT_GroupShapeNonVisualBuilder from(CT_GroupShapeNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvGrpSpPr = value.getCNvGrpSpPr();
    return this;
  }
}
