package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FOVAngleValueModel;

public class FOVAngleValueBuilder {
  private int value;

  public FOVAngleValueBuilder() {
  }

  public FOVAngleValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public FOVAngleValueBuilder from(FOVAngleValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public FOVAngleValueModel build() {
    return new FOVAngleValueModel(this.value);
  }
}
