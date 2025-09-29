package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.FirstSliceAngModel;

/**
 * This is a generated sequence class.
 */
public class FirstSliceAngBuilder {
  private int val;

  public FirstSliceAngBuilder() {
  }

  public FirstSliceAngBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public FirstSliceAngBuilder from(FirstSliceAngModel value) {
    this.val = value.getVal();
    return this;
  }

  public FirstSliceAngModel build() {
    return new FirstSliceAngModel(this.val);
  }
}
