package jxsd.gen.builder.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.GroupShapeNonVisualModel;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;
import jxsd.gen.model.drawingml.main.NonVisualGroupDrawingShapePropsModel;

/**
 * This is a generated sequence class.
 */
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

  public GroupShapeNonVisualBuilder from(GroupShapeNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvGrpSpPr = value.getCNvGrpSpPr();
    return this;
  }

  public GroupShapeNonVisualModel build() {
    return new GroupShapeNonVisualModel(this.cNvPr, this.cNvGrpSpPr);
  }
}
