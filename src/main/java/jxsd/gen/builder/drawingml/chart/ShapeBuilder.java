package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ShapeModel;
import jxsd.gen.model.drawingml.chart.ShapeValueModel;

/**
 * This is a generated sequence class.
 */
public class ShapeBuilder {
  private ShapeValueModel val;

  public ShapeBuilder() {
  }

  public ShapeBuilder setVal(ShapeValueModel val) {
    this.val = val;
    return this;
  }

  public ShapeBuilder from(ShapeModel value) {
    this.val = value.getVal();
    return this;
  }

  public ShapeModel build() {
    return new ShapeModel(this.val);
  }
}
