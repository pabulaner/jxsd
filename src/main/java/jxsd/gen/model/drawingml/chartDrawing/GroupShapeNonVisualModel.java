package jxsd.gen.model.drawingml.chartDrawing;

import jxsd.gen.builder.drawingml.chartDrawing.GroupShapeNonVisualBuilder;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;
import jxsd.gen.model.drawingml.main.NonVisualGroupDrawingShapePropsModel;

/**
 * This is a generated sequence class.
 */
public class GroupShapeNonVisualModel {
  private final NonVisualDrawingPropsModel cNvPr;

  private final NonVisualGroupDrawingShapePropsModel cNvGrpSpPr;

  public GroupShapeNonVisualModel(NonVisualDrawingPropsModel cNvPr,
      NonVisualGroupDrawingShapePropsModel cNvGrpSpPr) {
    this.cNvPr = cNvPr;
    this.cNvGrpSpPr = cNvGrpSpPr;
  }

  public GroupShapeNonVisualBuilder builder() {
    return new GroupShapeNonVisualBuilder().from(this);
  }

  public NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public NonVisualGroupDrawingShapePropsModel getCNvGrpSpPr() {
    return this.cNvGrpSpPr;
  }
}
