package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LogBaseModel;

/**
 * This is a generated sequence class.
 */
public class LogBaseBuilder {
  private double val;

  public LogBaseBuilder() {
  }

  public LogBaseBuilder setVal(double val) {
    this.val = val;
    return this;
  }

  public LogBaseBuilder from(LogBaseModel value) {
    this.val = value.getVal();
    return this;
  }

  public LogBaseModel build() {
    return new LogBaseModel(this.val);
  }
}
