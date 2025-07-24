package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.GroupShapeNonVisualModel;
import com.scell.model.drawingml.main.NonVisualDrawingPropsModel;
import com.scell.model.drawingml.main.NonVisualGroupDrawingShapePropsModel;

public class GroupShapeNonVisualBuilder {
  private NonVisualDrawingPropsModel cNvPr;

  private NonVisualGroupDrawingShapePropsModel cNvGrpSpPr;

  public GroupShapeNonVisualBuilder() {
  }

  public GroupShapeNonVisualBuilder setCNvPr(NonVisualDrawingPropsModel cNvPr) {
    this.cNvPr = cNvPr;
    return this;
  }

  public GroupShapeNonVisualBuilder setCNvGrpSpPr(NonVisualGroupDrawingShapePropsModel cNvGrpSpPr) {
    this.cNvGrpSpPr = cNvGrpSpPr;
    return this;
  }

  public GroupShapeNonVisualModel build() {
    return new GroupShapeNonVisualModel(this.cNvPr, this.cNvGrpSpPr);
  }

  public GroupShapeNonVisualBuilder from(GroupShapeNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvGrpSpPr = value.getCNvGrpSpPr();
    return this;
  }
}
