package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BubbleScaleModel;
import com.scell.model.drawingml.chart.BubbleScaleValueModel;

public class BubbleScaleBuilder {
  private BubbleScaleValueModel val;

  public BubbleScaleBuilder() {
  }

  public BubbleScaleBuilder setVal(BubbleScaleValueModel val) {
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
