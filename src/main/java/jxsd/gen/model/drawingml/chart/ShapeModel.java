package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ShapeBuilder;

/**
 * This is a generated sequence class.
 */
public class ShapeModel {
  private final ShapeValueModel val;

  public ShapeModel(ShapeValueModel val) {
    this.val = val;
  }

  public ShapeBuilder builder() {
    return new ShapeBuilder().from(this);
  }

  public ShapeValueModel getVal() {
    return this.val;
  }
}
