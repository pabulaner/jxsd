package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.MarkerCoordinateValueModel;

public class MarkerCoordinateValueBuilder {
  private double value;

  public MarkerCoordinateValueBuilder() {
  }

  public MarkerCoordinateValueBuilder setValue(double value) {
    this.value = value;
    return this;
  }

  public MarkerCoordinateValueBuilder from(MarkerCoordinateValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public MarkerCoordinateValueModel build() {
    return new MarkerCoordinateValueModel(this.value);
  }
}
