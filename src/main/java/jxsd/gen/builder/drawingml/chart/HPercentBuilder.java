package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.HPercentModel;

/**
 * This is a generated sequence class.
 */
public class HPercentBuilder {
  private int val;

  public HPercentBuilder() {
  }

  public HPercentBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public HPercentBuilder from(HPercentModel value) {
    this.val = value.getVal();
    return this;
  }

  public HPercentModel build() {
    return new HPercentModel(this.val);
  }
}
