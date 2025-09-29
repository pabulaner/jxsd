package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PeriodModel;

/**
 * This is a generated sequence class.
 */
public class PeriodBuilder {
  private short val;

  public PeriodBuilder() {
  }

  public PeriodBuilder setVal(short val) {
    this.val = val;
    return this;
  }

  public PeriodBuilder from(PeriodModel value) {
    this.val = value.getVal();
    return this;
  }

  public PeriodModel build() {
    return new PeriodModel(this.val);
  }
}
