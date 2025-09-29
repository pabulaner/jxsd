package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LayoutModeModel;
import jxsd.gen.model.drawingml.chart.LayoutModeValueModel;

/**
 * This is a generated sequence class.
 */
public class LayoutModeBuilder {
  private LayoutModeValueModel val;

  public LayoutModeBuilder() {
  }

  public LayoutModeBuilder setVal(LayoutModeValueModel val) {
    this.val = val;
    return this;
  }

  public LayoutModeBuilder from(LayoutModeModel value) {
    this.val = value.getVal();
    return this;
  }

  public LayoutModeModel build() {
    return new LayoutModeModel(this.val);
  }
}
