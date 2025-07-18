package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;

public class ST_PositiveCoordinateBuilder {
  private Long value;

  public ST_PositiveCoordinateBuilder() {
    this.value = null;
  }

  public ST_PositiveCoordinateBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_PositiveCoordinateBuilder from(ST_PositiveCoordinateModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_PositiveCoordinateModel build() {
    return new ST_PositiveCoordinateModel(this.value);
  }
}
