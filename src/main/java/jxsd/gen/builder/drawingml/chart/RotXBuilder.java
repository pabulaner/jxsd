package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.RotXModel;

/**
 * This is a generated sequence class.
 */
public class RotXBuilder {
  private byte val;

  public RotXBuilder() {
  }

  public RotXBuilder setVal(byte val) {
    this.val = val;
    return this;
  }

  public RotXBuilder from(RotXModel value) {
    this.val = value.getVal();
    return this;
  }

  public RotXModel build() {
    return new RotXModel(this.val);
  }
}
