package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.StyleValueModel;

public class StyleValueBuilder {
  private short value;

  public StyleValueBuilder() {
  }

  public StyleValueBuilder setValue(short value) {
    this.value = value;
    return this;
  }

  public StyleValueBuilder from(StyleValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public StyleValueModel build() {
    return new StyleValueModel(this.value);
  }
}
