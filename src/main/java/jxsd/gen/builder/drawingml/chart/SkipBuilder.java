package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.SkipModel;

/**
 * This is a generated sequence class.
 */
public class SkipBuilder {
  private int val;

  public SkipBuilder() {
  }

  public SkipBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public SkipBuilder from(SkipModel value) {
    this.val = value.getVal();
    return this;
  }

  public SkipModel build() {
    return new SkipModel(this.val);
  }
}
