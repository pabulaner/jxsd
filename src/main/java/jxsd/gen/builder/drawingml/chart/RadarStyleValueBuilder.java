package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.RadarStyleValueModel;

/**
 * This is a generated enum class.
 */
public class RadarStyleValueBuilder {
  private RadarStyleValueModel value;

  public RadarStyleValueBuilder() {
  }

  public RadarStyleValueBuilder setValue(RadarStyleValueModel value) {
    this.value = value;
    return this;
  }

  public RadarStyleValueBuilder from(RadarStyleValueModel value) {
    this.value = value;
    return this;
  }

  public RadarStyleValueModel build() {
    return this.value;
  }
}
