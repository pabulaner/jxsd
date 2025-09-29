package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.LogBaseBuilder;

/**
 * This is a generated sequence class.
 */
public class LogBaseModel {
  private final double val;

  public LogBaseModel(double val) {
    this.val = val;
  }

  public LogBaseBuilder builder() {
    return new LogBaseBuilder().from(this);
  }

  public double getVal() {
    return this.val;
  }
}
