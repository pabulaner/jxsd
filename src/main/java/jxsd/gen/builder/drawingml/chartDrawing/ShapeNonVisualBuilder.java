package jxsd.gen.builder.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.ShapeNonVisualModel;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;
import jxsd.gen.model.drawingml.main.NonVisualDrawingShapePropsModel;

/**
 * This is a generated sequence class.
 */
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

  public ShapeNonVisualBuilder from(ShapeNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvSpPr = value.getCNvSpPr();
    return this;
  }

  public ShapeNonVisualModel build() {
    return new ShapeNonVisualModel(this.cNvPr, this.cNvSpPr);
  }
}
