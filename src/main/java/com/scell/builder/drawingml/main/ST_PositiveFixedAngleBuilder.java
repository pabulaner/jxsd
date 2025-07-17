package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PositiveFixedAngleModel;

public class ST_PositiveFixedAngleBuilder {
  private Long value;

  public ST_PositiveFixedAngleBuilder() {
    this.value = null;
  }

  public ST_PositiveFixedAngleBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_PositiveFixedAngleBuilder from(ST_PositiveFixedAngleModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_PositiveFixedAngleModel build() {
    return new ST_PositiveFixedAngleModel(this.value);
  }
}
