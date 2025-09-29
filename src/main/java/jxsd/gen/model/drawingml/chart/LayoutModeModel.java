package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.LayoutModeBuilder;

/**
 * This is a generated sequence class.
 */
public class LayoutModeModel {
  private final LayoutModeValueModel val;

  public LayoutModeModel(LayoutModeValueModel val) {
    this.val = val;
  }

  public LayoutModeBuilder builder() {
    return new LayoutModeBuilder().from(this);
  }

  public LayoutModeValueModel getVal() {
    return this.val;
  }
}
