package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.GapAmountModel;

/**
 * This is a generated sequence class.
 */
public class GapAmountBuilder {
  private int val;

  public GapAmountBuilder() {
  }

  public GapAmountBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public GapAmountBuilder from(GapAmountModel value) {
    this.val = value.getVal();
    return this;
  }

  public GapAmountModel build() {
    return new GapAmountModel(this.val);
  }
}
