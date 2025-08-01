package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineEndWidthValueModel;

public class LineEndWidthValueBuilder {
  private LineEndWidthValueModel value;

  public LineEndWidthValueBuilder() {
    this.value = null;
  }

  public LineEndWidthValueBuilder from(LineEndWidthValueModel value) {
    this.value = value;
    return this;
  }

  public LineEndWidthValueModel build() {
    return this.value;
  }

  public LineEndWidthValueBuilder setValue(LineEndWidthValueModel value) {
    this.value = value;
    return this;
  }
}
