package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CompoundLineModel;

public class CompoundLineBuilder {
  private CompoundLineModel value;

  public CompoundLineBuilder() {
    this.value = null;
  }

  public CompoundLineBuilder from(CompoundLineModel value) {
    this.value = value;
    return this;
  }

  public CompoundLineModel build() {
    return this.value;
  }

  public CompoundLineBuilder setValue(CompoundLineModel value) {
    this.value = value;
    return this;
  }
}
