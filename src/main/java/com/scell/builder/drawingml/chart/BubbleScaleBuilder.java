package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BubbleScaleModel;

public class BubbleScaleBuilder {
  private BubbleScaleModel val;

  public BubbleScaleBuilder() {
  }

  public BubbleScaleBuilder setVal(BubbleScaleModel val) {
    this.val = val;
    return this;
  }

  public BubbleScaleModel build() {
    return new BubbleScaleModel(this.val);
  }

  public BubbleScaleBuilder from(BubbleScaleModel value) {
    this.val = value.getVal();
    return this;
  }
}
