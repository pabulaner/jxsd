package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TickMarkValueBuilder;

/**
 * This is a generated enum class.
 */
public enum TickMarkValueModel {
  CROSS,

  IN,

  NONE,

  OUT;

  public TickMarkValueBuilder builder() {
    return new TickMarkValueBuilder().from(this);
  }
}
