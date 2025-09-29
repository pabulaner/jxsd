package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.BuiltInUnitBuilder;

/**
 * This is a generated sequence class.
 */
public class BuiltInUnitModel {
  private final BuiltInUnitValueModel val;

  public BuiltInUnitModel(BuiltInUnitValueModel val) {
    this.val = val;
  }

  public BuiltInUnitBuilder builder() {
    return new BuiltInUnitBuilder().from(this);
  }

  public BuiltInUnitValueModel getVal() {
    return this.val;
  }
}
