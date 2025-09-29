package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.FirstSliceAngBuilder;

/**
 * This is a generated sequence class.
 */
public class FirstSliceAngModel {
  private final int val;

  public FirstSliceAngModel(int val) {
    this.val = val;
  }

  public FirstSliceAngBuilder builder() {
    return new FirstSliceAngBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
