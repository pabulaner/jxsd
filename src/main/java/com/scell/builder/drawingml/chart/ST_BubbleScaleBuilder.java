package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_BubbleScaleModel;

public class ST_BubbleScaleBuilder {
  private Long value;

  public ST_BubbleScaleBuilder() {
    this.value = null;
  }

  public ST_BubbleScaleBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_BubbleScaleBuilder from(ST_BubbleScaleModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_BubbleScaleModel build() {
    return new ST_BubbleScaleModel(this.value);
  }
}
