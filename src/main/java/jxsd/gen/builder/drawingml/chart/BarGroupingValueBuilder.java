package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BarGroupingValueModel;

/**
 * This is a generated enum class.
 */
public class BarGroupingValueBuilder {
  private BarGroupingValueModel value;

  public BarGroupingValueBuilder() {
  }

  public BarGroupingValueBuilder setValue(BarGroupingValueModel value) {
    this.value = value;
    return this;
  }

  public BarGroupingValueBuilder from(BarGroupingValueModel value) {
    this.value = value;
    return this;
  }

  public BarGroupingValueModel build() {
    return this.value;
  }
}
