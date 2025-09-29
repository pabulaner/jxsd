package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BarGroupingModel;
import jxsd.gen.model.drawingml.chart.BarGroupingValueModel;

/**
 * This is a generated sequence class.
 */
public class BarGroupingBuilder {
  private BarGroupingValueModel val;

  public BarGroupingBuilder() {
  }

  public BarGroupingBuilder setVal(BarGroupingValueModel val) {
    this.val = val;
    return this;
  }

  public BarGroupingBuilder from(BarGroupingModel value) {
    this.val = value.getVal();
    return this;
  }

  public BarGroupingModel build() {
    return new BarGroupingModel(this.val);
  }
}
