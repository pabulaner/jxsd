package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.RectAlignmentValueModel;

public class RectAlignmentValueBuilder {
  private RectAlignmentValueModel value;

  public RectAlignmentValueBuilder() {
    this.value = null;
  }

  public RectAlignmentValueBuilder from(RectAlignmentValueModel value) {
    this.value = value;
    return this;
  }

  public RectAlignmentValueModel build() {
    return this.value;
  }

  public RectAlignmentValueBuilder setValue(RectAlignmentValueModel value) {
    this.value = value;
    return this;
  }
}
