package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_FixedAngleModel;

public class ST_FixedAngleBuilder {
  private Long value;

  public ST_FixedAngleBuilder() {
    this.value = null;
  }

  public ST_FixedAngleBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_FixedAngleBuilder from(ST_FixedAngleModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_FixedAngleModel build() {
    return new ST_FixedAngleModel(this.value);
  }
}
