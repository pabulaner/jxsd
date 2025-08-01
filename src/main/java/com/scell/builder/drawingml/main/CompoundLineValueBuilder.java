package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CompoundLineValueModel;

public class CompoundLineValueBuilder {
  private CompoundLineValueModel value;

  public CompoundLineValueBuilder() {
    this.value = null;
  }

  public CompoundLineValueBuilder from(CompoundLineValueModel value) {
    this.value = value;
    return this;
  }

  public CompoundLineValueModel build() {
    return this.value;
  }

  public CompoundLineValueBuilder setValue(CompoundLineValueModel value) {
    this.value = value;
    return this;
  }
}
