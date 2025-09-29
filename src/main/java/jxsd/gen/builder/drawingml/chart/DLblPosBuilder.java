package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.DLblPosModel;
import jxsd.gen.model.drawingml.chart.DLblPosValueModel;

/**
 * This is a generated sequence class.
 */
public class DLblPosBuilder {
  private DLblPosValueModel val;

  public DLblPosBuilder() {
  }

  public DLblPosBuilder setVal(DLblPosValueModel val) {
    this.val = val;
    return this;
  }

  public DLblPosBuilder from(DLblPosModel value) {
    this.val = value.getVal();
    return this;
  }

  public DLblPosModel build() {
    return new DLblPosModel(this.val);
  }
}
