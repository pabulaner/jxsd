package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DepthPercentModel;

/**
 * This is a generated sequence class.
 */
public class DepthPercentBuilder {
  private int val;

  public DepthPercentBuilder() {
  }

  public DepthPercentBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public DepthPercentBuilder from(DepthPercentModel value) {
    this.val = value.getVal();
    return this;
  }

  public DepthPercentModel build() {
    return new DepthPercentModel(this.val);
  }
}
