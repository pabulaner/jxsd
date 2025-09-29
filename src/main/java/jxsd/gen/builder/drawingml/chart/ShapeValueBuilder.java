package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ShapeValueModel;

/**
 * This is a generated enum class.
 */
public class ShapeValueBuilder {
  private ShapeValueModel value;

  public ShapeValueBuilder() {
  }

  public ShapeValueBuilder setValue(ShapeValueModel value) {
    this.value = value;
    return this;
  }

  public ShapeValueBuilder from(ShapeValueModel value) {
    this.value = value;
    return this;
  }

  public ShapeValueModel build() {
    return this.value;
  }
}
