package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.PeriodBuilder;

/**
 * This is a generated sequence class.
 */
public class PeriodModel {
  private final short val;

  public PeriodModel(short val) {
    this.val = val;
  }

  public PeriodBuilder builder() {
    return new PeriodBuilder().from(this);
  }

  public short getVal() {
    return this.val;
  }
}
