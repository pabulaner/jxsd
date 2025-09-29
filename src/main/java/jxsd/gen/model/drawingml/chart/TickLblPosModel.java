package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.TickLblPosBuilder;

/**
 * This is a generated sequence class.
 */
public class TickLblPosModel {
  private final TickLblPosValueModel val;

  public TickLblPosModel(TickLblPosValueModel val) {
    this.val = val;
  }

  public TickLblPosBuilder builder() {
    return new TickLblPosBuilder().from(this);
  }

  public TickLblPosValueModel getVal() {
    return this.val;
  }
}
