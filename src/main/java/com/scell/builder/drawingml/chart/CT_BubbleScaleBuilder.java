package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BubbleScaleModel;
import com.scell.model.drawingml.chart.ST_BubbleScaleModel;

public class CT_BubbleScaleBuilder {
  private ST_BubbleScaleModel val;

  public CT_BubbleScaleBuilder() {
  }

  public CT_BubbleScaleBuilder setVal(ST_BubbleScaleModel val) {
    this.val = val;
    return this;
  }

  public CT_BubbleScaleModel build() {
    return new CT_BubbleScaleModel(this.val);
  }

  public CT_BubbleScaleBuilder from(CT_BubbleScaleModel value) {
    this.val = value.getVal();
    return this;
  }
}
