package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PenAlignmentModel;

public class ST_PenAlignmentBuilder {
  private ST_PenAlignmentModel value;

  public ST_PenAlignmentBuilder() {
    this.value = null;
  }

  public ST_PenAlignmentBuilder from(ST_PenAlignmentModel value) {
    this.value = value;
    return this;
  }

  public ST_PenAlignmentModel build() {
    return this.value;
  }

  public ST_PenAlignmentBuilder setValue(ST_PenAlignmentModel value) {
    this.value = value;
    return this;
  }
}
