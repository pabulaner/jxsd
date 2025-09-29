package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.AxPosBuilder;

/**
 * This is a generated sequence class.
 */
public class AxPosModel {
  private final AxPosValueModel val;

  public AxPosModel(AxPosValueModel val) {
    this.val = val;
  }

  public AxPosBuilder builder() {
    return new AxPosBuilder().from(this);
  }

  public AxPosValueModel getVal() {
    return this.val;
  }
}
