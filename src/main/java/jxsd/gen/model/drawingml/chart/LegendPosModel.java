package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.LegendPosBuilder;

/**
 * This is a generated sequence class.
 */
public class LegendPosModel {
  private final LegendPosValueModel val;

  public LegendPosModel(LegendPosValueModel val) {
    this.val = val;
  }

  public LegendPosBuilder builder() {
    return new LegendPosBuilder().from(this);
  }

  public LegendPosValueModel getVal() {
    return this.val;
  }
}
