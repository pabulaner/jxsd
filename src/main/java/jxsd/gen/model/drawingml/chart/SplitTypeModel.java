package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.SplitTypeBuilder;

/**
 * This is a generated sequence class.
 */
public class SplitTypeModel {
  private final SplitTypeValueModel val;

  public SplitTypeModel(SplitTypeValueModel val) {
    this.val = val;
  }

  public SplitTypeBuilder builder() {
    return new SplitTypeBuilder().from(this);
  }

  public SplitTypeValueModel getVal() {
    return this.val;
  }
}
