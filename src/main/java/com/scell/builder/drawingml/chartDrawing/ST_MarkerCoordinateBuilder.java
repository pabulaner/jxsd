package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.ST_MarkerCoordinateModel;

public class ST_MarkerCoordinateBuilder {
  private Double value;

  public ST_MarkerCoordinateBuilder() {
    this.value = null;
  }

  public ST_MarkerCoordinateBuilder setValue(Double value) {
    this.value = value;
    return this;
  }

  public ST_MarkerCoordinateBuilder from(ST_MarkerCoordinateModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_MarkerCoordinateModel build() {
    return new ST_MarkerCoordinateModel(this.value);
  }
}
