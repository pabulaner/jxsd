package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.StyleMatrixColumnIndexModel;

public class StyleMatrixColumnIndexBuilder {
  private long value;

  public StyleMatrixColumnIndexBuilder() {
  }

  public StyleMatrixColumnIndexBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public StyleMatrixColumnIndexBuilder from(StyleMatrixColumnIndexModel value) {
    this.value = value.getValue();
    return this;
  }

  public StyleMatrixColumnIndexModel build() {
    return new StyleMatrixColumnIndexModel(this.value);
  }
}
