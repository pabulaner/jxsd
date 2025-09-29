package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LblOffsetModel;

/**
 * This is a generated sequence class.
 */
public class LblOffsetBuilder {
  private int val;

  public LblOffsetBuilder() {
  }

  public LblOffsetBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public LblOffsetBuilder from(LblOffsetModel value) {
    this.val = value.getVal();
    return this;
  }

  public LblOffsetModel build() {
    return new LblOffsetModel(this.val);
  }
}
