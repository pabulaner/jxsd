package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LegendPosValueModel;

/**
 * This is a generated enum class.
 */
public class LegendPosValueBuilder {
  private LegendPosValueModel value;

  public LegendPosValueBuilder() {
  }

  public LegendPosValueBuilder setValue(LegendPosValueModel value) {
    this.value = value;
    return this;
  }

  public LegendPosValueBuilder from(LegendPosValueModel value) {
    this.value = value;
    return this;
  }

  public LegendPosValueModel build() {
    return this.value;
  }
}
