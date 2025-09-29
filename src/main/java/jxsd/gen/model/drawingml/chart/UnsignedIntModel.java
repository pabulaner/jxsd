package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.UnsignedIntBuilder;

/**
 * This is a generated sequence class.
 */
public class UnsignedIntModel {
  private final long val;

  public UnsignedIntModel(long val) {
    this.val = val;
  }

  public UnsignedIntBuilder builder() {
    return new UnsignedIntBuilder().from(this);
  }

  public long getVal() {
    return this.val;
  }
}
