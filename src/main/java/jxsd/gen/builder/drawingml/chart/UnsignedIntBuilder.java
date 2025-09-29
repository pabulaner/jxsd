package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.UnsignedIntModel;

/**
 * This is a generated sequence class.
 */
public class UnsignedIntBuilder {
  private long val;

  public UnsignedIntBuilder() {
  }

  public UnsignedIntBuilder setVal(long val) {
    this.val = val;
    return this;
  }

  public UnsignedIntBuilder from(UnsignedIntModel value) {
    this.val = value.getVal();
    return this;
  }

  public UnsignedIntModel build() {
    return new UnsignedIntModel(this.val);
  }
}
