package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.HoleSizeModel;

/**
 * This is a generated sequence class.
 */
public class HoleSizeBuilder {
  private short val;

  public HoleSizeBuilder() {
  }

  public HoleSizeBuilder setVal(short val) {
    this.val = val;
    return this;
  }

  public HoleSizeBuilder from(HoleSizeModel value) {
    this.val = value.getVal();
    return this;
  }

  public HoleSizeModel build() {
    return new HoleSizeModel(this.val);
  }
}
