package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PenAlignmentModel;

public class PenAlignmentBuilder {
  private PenAlignmentModel value;

  public PenAlignmentBuilder() {
    this.value = null;
  }

  public PenAlignmentBuilder from(PenAlignmentModel value) {
    this.value = value;
    return this;
  }

  public PenAlignmentModel build() {
    return this.value;
  }

  public PenAlignmentBuilder setValue(PenAlignmentModel value) {
    this.value = value;
    return this;
  }
}
