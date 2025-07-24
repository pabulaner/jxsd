package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.MarkerCoordinateModel;

public class MarkerCoordinateBuilder {
  private double value;

  public MarkerCoordinateBuilder() {
  }

  public MarkerCoordinateBuilder setValue(double value) {
    this.value = value;
    return this;
  }

  public MarkerCoordinateBuilder from(MarkerCoordinateModel value) {
    this.value = value.getValue();
    return this;
  }

  public MarkerCoordinateModel build() {
    return new MarkerCoordinateModel(this.value);
  }
}
