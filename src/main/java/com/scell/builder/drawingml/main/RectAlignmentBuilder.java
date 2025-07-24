package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.RectAlignmentModel;

public class RectAlignmentBuilder {
  private RectAlignmentModel value;

  public RectAlignmentBuilder() {
    this.value = null;
  }

  public RectAlignmentBuilder from(RectAlignmentModel value) {
    this.value = value;
    return this;
  }

  public RectAlignmentModel build() {
    return this.value;
  }

  public RectAlignmentBuilder setValue(RectAlignmentModel value) {
    this.value = value;
    return this;
  }
}
