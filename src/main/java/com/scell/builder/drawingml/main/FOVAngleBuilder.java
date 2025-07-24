package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FOVAngleModel;

public class FOVAngleBuilder {
  private int value;

  public FOVAngleBuilder() {
  }

  public FOVAngleBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public FOVAngleBuilder from(FOVAngleModel value) {
    this.value = value.getValue();
    return this;
  }

  public FOVAngleModel build() {
    return new FOVAngleModel(this.value);
  }
}
