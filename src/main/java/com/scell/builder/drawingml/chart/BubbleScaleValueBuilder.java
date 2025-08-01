package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BubbleScaleValueModel;

public class BubbleScaleValueBuilder {
  private long value;

  public BubbleScaleValueBuilder() {
  }

  public BubbleScaleValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public BubbleScaleValueBuilder from(BubbleScaleValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public BubbleScaleValueModel build() {
    return new BubbleScaleValueModel(this.value);
  }
}
