package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.SecondPieSizeBuilder;

/**
 * This is a generated sequence class.
 */
public class SecondPieSizeModel {
  private final int val;

  public SecondPieSizeModel(int val) {
    this.val = val;
  }

  public SecondPieSizeBuilder builder() {
    return new SecondPieSizeBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
