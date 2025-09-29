package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TickLblPosModel;
import jxsd.gen.model.drawingml.chart.TickLblPosValueModel;

/**
 * This is a generated sequence class.
 */
public class TickLblPosBuilder {
  private TickLblPosValueModel val;

  public TickLblPosBuilder() {
  }

  public TickLblPosBuilder setVal(TickLblPosValueModel val) {
    this.val = val;
    return this;
  }

  public TickLblPosBuilder from(TickLblPosModel value) {
    this.val = value.getVal();
    return this;
  }

  public TickLblPosModel build() {
    return new TickLblPosModel(this.val);
  }
}
