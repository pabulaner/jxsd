package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineEndLengthValueModel;

public class LineEndLengthValueBuilder {
  private LineEndLengthValueModel value;

  public LineEndLengthValueBuilder() {
    this.value = null;
  }

  public LineEndLengthValueBuilder from(LineEndLengthValueModel value) {
    this.value = value;
    return this;
  }

  public LineEndLengthValueModel build() {
    return this.value;
  }

  public LineEndLengthValueBuilder setValue(LineEndLengthValueModel value) {
    this.value = value;
    return this;
  }
}
