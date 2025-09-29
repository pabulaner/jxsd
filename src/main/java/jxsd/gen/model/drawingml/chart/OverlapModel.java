package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.OverlapBuilder;

/**
 * This is a generated sequence class.
 */
public class OverlapModel {
  private final byte val;

  public OverlapModel(byte val) {
    this.val = val;
  }

  public OverlapBuilder builder() {
    return new OverlapBuilder().from(this);
  }

  public byte getVal() {
    return this.val;
  }
}
