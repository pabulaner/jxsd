package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.AxisUnitBuilder;

/**
 * This is a generated sequence class.
 */
public class AxisUnitModel {
  private final double val;

  public AxisUnitModel(double val) {
    this.val = val;
  }

  public AxisUnitBuilder builder() {
    return new AxisUnitBuilder().from(this);
  }

  public double getVal() {
    return this.val;
  }
}
