package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.AxPosModel;
import jxsd.gen.model.drawingml.chart.AxPosValueModel;

/**
 * This is a generated sequence class.
 */
public class AxPosBuilder {
  private AxPosValueModel val;

  public AxPosBuilder() {
  }

  public AxPosBuilder setVal(AxPosValueModel val) {
    this.val = val;
    return this;
  }

  public AxPosBuilder from(AxPosModel value) {
    this.val = value.getVal();
    return this;
  }

  public AxPosModel build() {
    return new AxPosModel(this.val);
  }
}
