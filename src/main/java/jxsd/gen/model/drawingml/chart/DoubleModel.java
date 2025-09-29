package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.DoubleBuilder;

/**
 * This is a generated sequence class.
 */
public class DoubleModel {
  private final double val;

  public DoubleModel(double val) {
    this.val = val;
  }

  public DoubleBuilder builder() {
    return new DoubleBuilder().from(this);
  }

  public double getVal() {
    return this.val;
  }
}
