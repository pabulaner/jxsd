package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineEndLengthModel;

public class LineEndLengthBuilder {
  private LineEndLengthModel value;

  public LineEndLengthBuilder() {
    this.value = null;
  }

  public LineEndLengthBuilder from(LineEndLengthModel value) {
    this.value = value;
    return this;
  }

  public LineEndLengthModel build() {
    return this.value;
  }

  public LineEndLengthBuilder setValue(LineEndLengthModel value) {
    this.value = value;
    return this;
  }
}
