package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AngleValueModel;

public class AngleValueBuilder {
  private int value;

  public AngleValueBuilder() {
  }

  public AngleValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public AngleValueBuilder from(AngleValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public AngleValueModel build() {
    return new AngleValueModel(this.value);
  }
}
