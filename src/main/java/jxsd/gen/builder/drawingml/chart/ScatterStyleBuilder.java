package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.ScatterStyleModel;
import jxsd.gen.model.drawingml.chart.ScatterStyleValueModel;

/**
 * This is a generated sequence class.
 */
public class ScatterStyleBuilder {
  private ScatterStyleValueModel val;

  public ScatterStyleBuilder() {
  }

  public ScatterStyleBuilder setVal(ScatterStyleValueModel val) {
    this.val = val;
    return this;
  }

  public ScatterStyleBuilder from(ScatterStyleModel value) {
    this.val = value.getVal();
    return this;
  }

  public ScatterStyleModel build() {
    return new ScatterStyleModel(this.val);
  }
}
