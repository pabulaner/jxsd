package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_FOVAngleModel;

public class ST_FOVAngleBuilder {
  private Long value;

  public ST_FOVAngleBuilder() {
    this.value = null;
  }

  public ST_FOVAngleBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_FOVAngleBuilder from(ST_FOVAngleModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_FOVAngleModel build() {
    return new ST_FOVAngleModel(this.value);
  }
}
