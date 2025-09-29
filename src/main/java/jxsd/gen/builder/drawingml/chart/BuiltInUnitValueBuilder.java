package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BuiltInUnitValueModel;

/**
 * This is a generated enum class.
 */
public class BuiltInUnitValueBuilder {
  private BuiltInUnitValueModel value;

  public BuiltInUnitValueBuilder() {
  }

  public BuiltInUnitValueBuilder setValue(BuiltInUnitValueModel value) {
    this.value = value;
    return this;
  }

  public BuiltInUnitValueBuilder from(BuiltInUnitValueModel value) {
    this.value = value;
    return this;
  }

  public BuiltInUnitValueModel build() {
    return this.value;
  }
}
