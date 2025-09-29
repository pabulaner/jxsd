package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.RadarStyleModel;
import jxsd.gen.model.drawingml.chart.RadarStyleValueModel;

/**
 * This is a generated sequence class.
 */
public class RadarStyleBuilder {
  private RadarStyleValueModel val;

  public RadarStyleBuilder() {
  }

  public RadarStyleBuilder setVal(RadarStyleValueModel val) {
    this.val = val;
    return this;
  }

  public RadarStyleBuilder from(RadarStyleModel value) {
    this.val = value.getVal();
    return this;
  }

  public RadarStyleModel build() {
    return new RadarStyleModel(this.val);
  }
}
