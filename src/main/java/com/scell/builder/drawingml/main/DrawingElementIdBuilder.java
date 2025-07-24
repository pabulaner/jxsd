package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.DrawingElementIdModel;

public class DrawingElementIdBuilder {
  private long value;

  public DrawingElementIdBuilder() {
  }

  public DrawingElementIdBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public DrawingElementIdBuilder from(DrawingElementIdModel value) {
    this.value = value.getValue();
    return this;
  }

  public DrawingElementIdModel build() {
    return new DrawingElementIdModel(this.value);
  }
}
