package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.ST_MarkerCoordinateModel;

public class ST_MarkerCoordinateConverter {
  private ST_MarkerCoordinateConverter() {
  }

  public static ST_MarkerCoordinateModel fromDocx4J(Double value) {
    if (value == null) return null;
    return new ST_MarkerCoordinateModel(value);
  }

  public static Double toDocx4J(ST_MarkerCoordinateModel value) {
    return null;
  }
}
