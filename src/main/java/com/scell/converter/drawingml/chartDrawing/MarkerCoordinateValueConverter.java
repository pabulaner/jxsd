package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.MarkerCoordinateValueModel;

public class MarkerCoordinateValueConverter {
  private MarkerCoordinateValueConverter() {
  }

  public static MarkerCoordinateValueModel fromDocx4J(Double value) {
    if (value == null) return null;
    return new MarkerCoordinateValueModel(value);
  }
}
