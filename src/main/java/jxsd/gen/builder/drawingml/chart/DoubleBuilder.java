package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DoubleModel;

/**
 * This is a generated sequence class.
 */
public class DoubleBuilder {
  private double val;

  public DoubleBuilder() {
  }

  public DoubleBuilder setVal(double val) {
    this.val = val;
    return this;
  }

  public DoubleBuilder from(DoubleModel value) {
    this.val = value.getVal();
    return this;
  }

  public DoubleModel build() {
    return new DoubleModel(this.val);
  }
}
