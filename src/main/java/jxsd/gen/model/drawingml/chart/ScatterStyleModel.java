package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.ScatterStyleBuilder;

/**
 * This is a generated sequence class.
 */
public class ScatterStyleModel {
  private final ScatterStyleValueModel val;

  public ScatterStyleModel(ScatterStyleValueModel val) {
    this.val = val;
  }

  public ScatterStyleBuilder builder() {
    return new ScatterStyleBuilder().from(this);
  }

  public ScatterStyleValueModel getVal() {
    return this.val;
  }
}
