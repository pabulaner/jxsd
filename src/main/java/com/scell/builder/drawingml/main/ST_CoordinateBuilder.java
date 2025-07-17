package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_CoordinateModel;

public class ST_CoordinateBuilder {
  private Long value;

  public ST_CoordinateBuilder() {
    this.value = null;
  }

  public ST_CoordinateBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_CoordinateBuilder from(ST_CoordinateModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_CoordinateModel build() {
    return new ST_CoordinateModel(this.value);
  }
}
