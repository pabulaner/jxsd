package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.RadarStyleBuilder;

/**
 * This is a generated sequence class.
 */
public class RadarStyleModel {
  private final RadarStyleValueModel val;

  public RadarStyleModel(RadarStyleValueModel val) {
    this.val = val;
  }

  public RadarStyleBuilder builder() {
    return new RadarStyleBuilder().from(this);
  }

  public RadarStyleValueModel getVal() {
    return this.val;
  }
}
