package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.StyleModel;
import com.scell.model.drawingml.chart.StyleValueModel;

public class StyleBuilder {
  private StyleValueModel val;

  public StyleBuilder() {
  }

  public StyleBuilder setVal(StyleValueModel val) {
    this.val = val;
    return this;
  }

  public StyleModel build() {
    return new StyleModel(this.val);
  }

  public StyleBuilder from(StyleModel value) {
    this.val = value.getVal();
    return this;
  }
}
