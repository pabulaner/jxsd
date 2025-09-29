package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OverlapModel;

/**
 * This is a generated sequence class.
 */
public class OverlapBuilder {
  private byte val;

  public OverlapBuilder() {
  }

  public OverlapBuilder setVal(byte val) {
    this.val = val;
    return this;
  }

  public OverlapBuilder from(OverlapModel value) {
    this.val = value.getVal();
    return this;
  }

  public OverlapModel build() {
    return new OverlapModel(this.val);
  }
}
