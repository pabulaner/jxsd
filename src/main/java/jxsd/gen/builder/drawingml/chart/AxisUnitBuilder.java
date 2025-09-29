package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.AxisUnitModel;

/**
 * This is a generated sequence class.
 */
public class AxisUnitBuilder {
  private double val;

  public AxisUnitBuilder() {
  }

  public AxisUnitBuilder setVal(double val) {
    this.val = val;
    return this;
  }

  public AxisUnitBuilder from(AxisUnitModel value) {
    this.val = value.getVal();
    return this;
  }

  public AxisUnitModel build() {
    return new AxisUnitModel(this.val);
  }
}
