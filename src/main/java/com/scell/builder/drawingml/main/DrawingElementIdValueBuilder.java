package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.DrawingElementIdValueModel;

public class DrawingElementIdValueBuilder {
  private long value;

  public DrawingElementIdValueBuilder() {
  }

  public DrawingElementIdValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public DrawingElementIdValueBuilder from(DrawingElementIdValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public DrawingElementIdValueModel build() {
    return new DrawingElementIdValueModel(this.value);
  }
}
