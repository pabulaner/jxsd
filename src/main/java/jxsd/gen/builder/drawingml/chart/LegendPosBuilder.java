package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LegendPosModel;
import jxsd.gen.model.drawingml.chart.LegendPosValueModel;

/**
 * This is a generated sequence class.
 */
public class LegendPosBuilder {
  private LegendPosValueModel val;

  public LegendPosBuilder() {
  }

  public LegendPosBuilder setVal(LegendPosValueModel val) {
    this.val = val;
    return this;
  }

  public LegendPosBuilder from(LegendPosModel value) {
    this.val = value.getVal();
    return this;
  }

  public LegendPosModel build() {
    return new LegendPosModel(this.val);
  }
}
