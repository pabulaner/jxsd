package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineEndTypeValueModel;

public class LineEndTypeValueBuilder {
  private LineEndTypeValueModel value;

  public LineEndTypeValueBuilder() {
    this.value = null;
  }

  public LineEndTypeValueBuilder from(LineEndTypeValueModel value) {
    this.value = value;
    return this;
  }

  public LineEndTypeValueModel build() {
    return this.value;
  }

  public LineEndTypeValueBuilder setValue(LineEndTypeValueModel value) {
    this.value = value;
    return this;
  }
}
