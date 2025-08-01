package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PenAlignmentValueModel;

public class PenAlignmentValueBuilder {
  private PenAlignmentValueModel value;

  public PenAlignmentValueBuilder() {
    this.value = null;
  }

  public PenAlignmentValueBuilder from(PenAlignmentValueModel value) {
    this.value = value;
    return this;
  }

  public PenAlignmentValueModel build() {
    return this.value;
  }

  public PenAlignmentValueBuilder setValue(PenAlignmentValueModel value) {
    this.value = value;
    return this;
  }
}
