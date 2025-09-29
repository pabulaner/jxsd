package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.BooleanBuilder;

/**
 * This is a generated sequence class.
 */
public class BooleanModel {
  private final boolean val;

  public BooleanModel(boolean val) {
    this.val = val;
  }

  public BooleanBuilder builder() {
    return new BooleanBuilder().from(this);
  }

  public boolean getVal() {
    return this.val;
  }
}
