package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.HoleSizeBuilder;

/**
 * This is a generated sequence class.
 */
public class HoleSizeModel {
  private final short val;

  public HoleSizeModel(short val) {
    this.val = val;
  }

  public HoleSizeBuilder builder() {
    return new HoleSizeBuilder().from(this);
  }

  public short getVal() {
    return this.val;
  }
}
