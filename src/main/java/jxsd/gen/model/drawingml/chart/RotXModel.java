package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.RotXBuilder;

/**
 * This is a generated sequence class.
 */
public class RotXModel {
  private final byte val;

  public RotXModel(byte val) {
    this.val = val;
  }

  public RotXBuilder builder() {
    return new RotXBuilder().from(this);
  }

  public byte getVal() {
    return this.val;
  }
}
