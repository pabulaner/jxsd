package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.DLblPosBuilder;

/**
 * This is a generated sequence class.
 */
public class DLblPosModel {
  private final DLblPosValueModel val;

  public DLblPosModel(DLblPosValueModel val) {
    this.val = val;
  }

  public DLblPosBuilder builder() {
    return new DLblPosBuilder().from(this);
  }

  public DLblPosValueModel getVal() {
    return this.val;
  }
}
