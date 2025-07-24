package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineEndTypeModel;

public class LineEndTypeBuilder {
  private LineEndTypeModel value;

  public LineEndTypeBuilder() {
    this.value = null;
  }

  public LineEndTypeBuilder from(LineEndTypeModel value) {
    this.value = value;
    return this;
  }

  public LineEndTypeModel build() {
    return this.value;
  }

  public LineEndTypeBuilder setValue(LineEndTypeModel value) {
    this.value = value;
    return this;
  }
}
