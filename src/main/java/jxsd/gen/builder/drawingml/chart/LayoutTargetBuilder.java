package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LayoutTargetModel;
import jxsd.gen.model.drawingml.chart.LayoutTargetValueModel;

/**
 * This is a generated sequence class.
 */
public class LayoutTargetBuilder {
  private LayoutTargetValueModel val;

  public LayoutTargetBuilder() {
  }

  public LayoutTargetBuilder setVal(LayoutTargetValueModel val) {
    this.val = val;
    return this;
  }

  public LayoutTargetBuilder from(LayoutTargetModel value) {
    this.val = value.getVal();
    return this;
  }

  public LayoutTargetModel build() {
    return new LayoutTargetModel(this.val);
  }
}
