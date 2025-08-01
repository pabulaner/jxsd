package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineWidthValueModel;

public class LineWidthValueBuilder {
  private int value;

  public LineWidthValueBuilder() {
  }

  public LineWidthValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public LineWidthValueBuilder from(LineWidthValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public LineWidthValueModel build() {
    return new LineWidthValueModel(this.value);
  }
}
