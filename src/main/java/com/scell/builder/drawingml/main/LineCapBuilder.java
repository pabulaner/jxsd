package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineCapModel;

public class LineCapBuilder {
  private LineCapModel value;

  public LineCapBuilder() {
    this.value = null;
  }

  public LineCapBuilder from(LineCapModel value) {
    this.value = value;
    return this;
  }

  public LineCapModel build() {
    return this.value;
  }

  public LineCapBuilder setValue(LineCapModel value) {
    this.value = value;
    return this;
  }
}
