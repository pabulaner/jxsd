package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.LayoutTargetBuilder;

/**
 * This is a generated sequence class.
 */
public class LayoutTargetModel {
  private final LayoutTargetValueModel val;

  public LayoutTargetModel(LayoutTargetValueModel val) {
    this.val = val;
  }

  public LayoutTargetBuilder builder() {
    return new LayoutTargetBuilder().from(this);
  }

  public LayoutTargetValueModel getVal() {
    return this.val;
  }
}
