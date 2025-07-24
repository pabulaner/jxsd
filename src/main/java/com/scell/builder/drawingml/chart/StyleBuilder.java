package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.StyleModel;

public class StyleBuilder {
  private StyleModel val;

  public StyleBuilder() {
  }

  public StyleBuilder setVal(StyleModel val) {
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
