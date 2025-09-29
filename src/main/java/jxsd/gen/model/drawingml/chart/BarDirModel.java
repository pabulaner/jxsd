package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.BarDirBuilder;

/**
 * This is a generated sequence class.
 */
public class BarDirModel {
  private final BarDirValueModel val;

  public BarDirModel(BarDirValueModel val) {
    this.val = val;
  }

  public BarDirBuilder builder() {
    return new BarDirBuilder().from(this);
  }

  public BarDirValueModel getVal() {
    return this.val;
  }
}
