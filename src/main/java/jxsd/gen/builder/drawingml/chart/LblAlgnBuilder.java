package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LblAlgnModel;
import jxsd.gen.model.drawingml.chart.LblAlgnValueModel;

/**
 * This is a generated sequence class.
 */
public class LblAlgnBuilder {
  private LblAlgnValueModel val;

  public LblAlgnBuilder() {
  }

  public LblAlgnBuilder setVal(LblAlgnValueModel val) {
    this.val = val;
    return this;
  }

  public LblAlgnBuilder from(LblAlgnModel value) {
    this.val = value.getVal();
    return this;
  }

  public LblAlgnModel build() {
    return new LblAlgnModel(this.val);
  }
}
