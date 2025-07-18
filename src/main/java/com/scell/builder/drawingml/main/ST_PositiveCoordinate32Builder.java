package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PositiveCoordinate32Model;

public class ST_PositiveCoordinate32Builder {
  private Long value;

  public ST_PositiveCoordinate32Builder() {
    this.value = null;
  }

  public ST_PositiveCoordinate32Builder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_PositiveCoordinate32Builder from(ST_PositiveCoordinate32Model value) {
    this.value = value.getValue();
    return this;
  }

  public ST_PositiveCoordinate32Model build() {
    return new ST_PositiveCoordinate32Model(this.value);
  }
}
