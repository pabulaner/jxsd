package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TickLblPosValueBuilder;

/**
 * This is a generated enum class.
 */
public enum TickLblPosValueModel {
  HIGH,

  LOW,

  NEXT_TO,

  NONE;

  public TickLblPosValueBuilder builder() {
    return new TickLblPosValueBuilder().from(this);
  }
}
