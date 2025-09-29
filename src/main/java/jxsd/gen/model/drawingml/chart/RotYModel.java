package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.RotYBuilder;

/**
 * This is a generated sequence class.
 */
public class RotYModel {
  private final int val;

  public RotYModel(int val) {
    this.val = val;
  }

  public RotYBuilder builder() {
    return new RotYBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
