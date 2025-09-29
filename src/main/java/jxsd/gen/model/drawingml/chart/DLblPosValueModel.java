package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.DLblPosValueBuilder;

/**
 * This is a generated enum class.
 */
public enum DLblPosValueModel {
  BEST_FIT,

  B,

  CTR,

  IN_BASE,

  IN_END,

  L,

  OUT_END,

  R,

  T;

  public DLblPosValueBuilder builder() {
    return new DLblPosValueBuilder().from(this);
  }
}
