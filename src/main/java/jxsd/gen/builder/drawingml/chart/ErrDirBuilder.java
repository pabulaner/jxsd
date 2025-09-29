package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ErrDirModel;
import jxsd.gen.model.drawingml.chart.ErrDirValueModel;

/**
 * This is a generated sequence class.
 */
public class ErrDirBuilder {
  private ErrDirValueModel val;

  public ErrDirBuilder() {
  }

  public ErrDirBuilder setVal(ErrDirValueModel val) {
    this.val = val;
    return this;
  }

  public ErrDirBuilder from(ErrDirModel value) {
    this.val = value.getVal();
    return this;
  }

  public ErrDirModel build() {
    return new ErrDirModel(this.val);
  }
}
