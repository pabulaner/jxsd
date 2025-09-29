package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.BubbleScaleBuilder;

/**
 * This is a generated sequence class.
 */
public class BubbleScaleModel {
  private final long val;

  public BubbleScaleModel(long val) {
    this.val = val;
  }

  public BubbleScaleBuilder builder() {
    return new BubbleScaleBuilder().from(this);
  }

  public long getVal() {
    return this.val;
  }
}
