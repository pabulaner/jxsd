package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineWidthModel;

public class LineWidthBuilder {
  private int value;

  public LineWidthBuilder() {
  }

  public LineWidthBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public LineWidthBuilder from(LineWidthModel value) {
    this.value = value.getValue();
    return this;
  }

  public LineWidthModel build() {
    return new LineWidthModel(this.value);
  }
}
