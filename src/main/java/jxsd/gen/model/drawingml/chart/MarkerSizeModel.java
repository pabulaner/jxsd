package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.MarkerSizeBuilder;

/**
 * This is a generated sequence class.
 */
public class MarkerSizeModel {
  private final short val;

  public MarkerSizeModel(short val) {
    this.val = val;
  }

  public MarkerSizeBuilder builder() {
    return new MarkerSizeBuilder().from(this);
  }

  public short getVal() {
    return this.val;
  }
}
