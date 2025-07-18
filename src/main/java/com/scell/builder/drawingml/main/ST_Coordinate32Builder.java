package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_Coordinate32Model;

public class ST_Coordinate32Builder {
  private Long value;

  public ST_Coordinate32Builder() {
    this.value = null;
  }

  public ST_Coordinate32Builder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_Coordinate32Builder from(ST_Coordinate32Model value) {
    this.value = value.getValue();
    return this;
  }

  public ST_Coordinate32Model build() {
    return new ST_Coordinate32Model(this.value);
  }
}
