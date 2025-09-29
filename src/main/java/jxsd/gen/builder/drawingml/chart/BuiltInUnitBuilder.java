package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BuiltInUnitModel;
import jxsd.gen.model.drawingml.chart.BuiltInUnitValueModel;

/**
 * This is a generated sequence class.
 */
public class BuiltInUnitBuilder {
  private BuiltInUnitValueModel val;

  public BuiltInUnitBuilder() {
  }

  public BuiltInUnitBuilder setVal(BuiltInUnitValueModel val) {
    this.val = val;
    return this;
  }

  public BuiltInUnitBuilder from(BuiltInUnitModel value) {
    this.val = value.getVal();
    return this;
  }

  public BuiltInUnitModel build() {
    return new BuiltInUnitModel(this.val);
  }
}
