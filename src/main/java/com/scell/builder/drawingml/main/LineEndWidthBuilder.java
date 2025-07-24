package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineEndWidthModel;

public class LineEndWidthBuilder {
  private LineEndWidthModel value;

  public LineEndWidthBuilder() {
    this.value = null;
  }

  public LineEndWidthBuilder from(LineEndWidthModel value) {
    this.value = value;
    return this;
  }

  public LineEndWidthModel build() {
    return this.value;
  }

  public LineEndWidthBuilder setValue(LineEndWidthModel value) {
    this.value = value;
    return this;
  }
}
