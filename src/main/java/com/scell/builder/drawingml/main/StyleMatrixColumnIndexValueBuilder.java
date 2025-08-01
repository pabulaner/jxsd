package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.StyleMatrixColumnIndexValueModel;

public class StyleMatrixColumnIndexValueBuilder {
  private long value;

  public StyleMatrixColumnIndexValueBuilder() {
  }

  public StyleMatrixColumnIndexValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public StyleMatrixColumnIndexValueBuilder from(StyleMatrixColumnIndexValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public StyleMatrixColumnIndexValueModel build() {
    return new StyleMatrixColumnIndexValueModel(this.value);
  }
}
