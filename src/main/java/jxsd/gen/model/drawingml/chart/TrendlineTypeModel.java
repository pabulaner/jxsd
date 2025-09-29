package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TrendlineTypeBuilder;

/**
 * This is a generated sequence class.
 */
public class TrendlineTypeModel {
  private final TrendlineTypeValueModel val;

  public TrendlineTypeModel(TrendlineTypeValueModel val) {
    this.val = val;
  }

  public TrendlineTypeBuilder builder() {
    return new TrendlineTypeBuilder().from(this);
  }

  public TrendlineTypeValueModel getVal() {
    return this.val;
  }
}
