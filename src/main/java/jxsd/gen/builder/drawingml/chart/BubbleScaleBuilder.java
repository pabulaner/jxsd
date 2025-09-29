package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.BubbleScaleModel;

/**
 * This is a generated sequence class.
 */
public class BubbleScaleBuilder {
  private long val;

  public BubbleScaleBuilder() {
  }

  public BubbleScaleBuilder setVal(long val) {
    this.val = val;
    return this;
  }

  public BubbleScaleBuilder from(BubbleScaleModel value) {
    this.val = value.getVal();
    return this;
  }

  public BubbleScaleModel build() {
    return new BubbleScaleModel(this.val);
  }
}
