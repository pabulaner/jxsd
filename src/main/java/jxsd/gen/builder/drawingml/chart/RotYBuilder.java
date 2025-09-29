package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.RotYModel;

/**
 * This is a generated sequence class.
 */
public class RotYBuilder {
  private int val;

  public RotYBuilder() {
  }

  public RotYBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public RotYBuilder from(RotYModel value) {
    this.val = value.getVal();
    return this;
  }

  public RotYModel build() {
    return new RotYModel(this.val);
  }
}
