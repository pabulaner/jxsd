package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.TickMarkModel;
import jxsd.gen.model.drawingml.chart.TickMarkValueModel;

/**
 * This is a generated sequence class.
 */
public class TickMarkBuilder {
  private TickMarkValueModel val;

  public TickMarkBuilder() {
  }

  public TickMarkBuilder setVal(TickMarkValueModel val) {
    this.val = val;
    return this;
  }

  public TickMarkBuilder from(TickMarkModel value) {
    this.val = value.getVal();
    return this;
  }

  public TickMarkModel build() {
    return new TickMarkModel(this.val);
  }
}
