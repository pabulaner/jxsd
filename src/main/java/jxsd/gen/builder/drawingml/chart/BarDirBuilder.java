package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BarDirModel;
import jxsd.gen.model.drawingml.chart.BarDirValueModel;

/**
 * This is a generated sequence class.
 */
public class BarDirBuilder {
  private BarDirValueModel val;

  public BarDirBuilder() {
  }

  public BarDirBuilder setVal(BarDirValueModel val) {
    this.val = val;
    return this;
  }

  public BarDirBuilder from(BarDirModel value) {
    this.val = value.getVal();
    return this;
  }

  public BarDirModel build() {
    return new BarDirModel(this.val);
  }
}
