package jxsd.gen.model.drawingml.chartDrawing;

import jxsd.gen.builder.drawingml.chartDrawing.ShapeNonVisualBuilder;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;
import jxsd.gen.model.drawingml.main.NonVisualDrawingShapePropsModel;

/**
 * This is a generated sequence class.
 */
public class ShapeNonVisualModel {
  private final NonVisualDrawingPropsModel cNvPr;

  private final NonVisualDrawingShapePropsModel cNvSpPr;

  public ShapeNonVisualModel(NonVisualDrawingPropsModel cNvPr,
      NonVisualDrawingShapePropsModel cNvSpPr) {
    this.cNvPr = cNvPr;
    this.cNvSpPr = cNvSpPr;
  }

  public ShapeNonVisualBuilder builder() {
    return new ShapeNonVisualBuilder().from(this);
  }

  public NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public NonVisualDrawingShapePropsModel getCNvSpPr() {
    return this.cNvSpPr;
  }
}
