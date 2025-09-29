package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.RadarStyleValueBuilder;

/**
 * This is a generated enum class.
 */
public enum RadarStyleValueModel {
  STANDARD,

  MARKER,

  FILLED;

  public RadarStyleValueBuilder builder() {
    return new RadarStyleValueBuilder().from(this);
  }
}
