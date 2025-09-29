package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.StyleBuilder;

/**
 * This is a generated sequence class.
 */
public class StyleModel {
  private final short val;

  public StyleModel(short val) {
    this.val = val;
  }

  public StyleBuilder builder() {
    return new StyleBuilder().from(this);
  }

  public short getVal() {
    return this.val;
  }
}
