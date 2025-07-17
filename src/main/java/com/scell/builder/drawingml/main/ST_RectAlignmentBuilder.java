package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_RectAlignmentModel;

public class ST_RectAlignmentBuilder {
  private ST_RectAlignmentModel value;

  public ST_RectAlignmentBuilder() {
    this.value = null;
  }

  public ST_RectAlignmentBuilder from(ST_RectAlignmentModel value) {
    this.value = value;
    return this;
  }

  public ST_RectAlignmentModel build() {
    return this.value;
  }

  public ST_RectAlignmentBuilder setValue(ST_RectAlignmentModel value) {
    this.value = value;
    return this;
  }
}
