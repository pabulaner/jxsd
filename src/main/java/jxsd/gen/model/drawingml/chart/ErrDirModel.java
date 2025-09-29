package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ErrDirBuilder;

/**
 * This is a generated sequence class.
 */
public class ErrDirModel {
  private final ErrDirValueModel val;

  public ErrDirModel(ErrDirValueModel val) {
    this.val = val;
  }

  public ErrDirBuilder builder() {
    return new ErrDirBuilder().from(this);
  }

  public ErrDirValueModel getVal() {
    return this.val;
  }
}
