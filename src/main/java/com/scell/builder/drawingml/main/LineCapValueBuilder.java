package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.LineCapValueModel;

public class LineCapValueBuilder {
  private LineCapValueModel value;

  public LineCapValueBuilder() {
    this.value = null;
  }

  public LineCapValueBuilder from(LineCapValueModel value) {
    this.value = value;
    return this;
  }

  public LineCapValueModel build() {
    return this.value;
  }

  public LineCapValueBuilder setValue(LineCapValueModel value) {
    this.value = value;
    return this;
  }
}
