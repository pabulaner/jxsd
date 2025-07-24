package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.MarkerCoordinateModel;

public class MarkerCoordinateConverter {
  private MarkerCoordinateConverter() {
  }

  public static MarkerCoordinateModel fromDocx4J(Double value) {
    if (value == null) return null;
    return new MarkerCoordinateModel(value);
  }
}
