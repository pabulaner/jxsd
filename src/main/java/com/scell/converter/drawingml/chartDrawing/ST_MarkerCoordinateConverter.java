package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.ST_MarkerCoordinateModel;

public class ST_MarkerCoordinateConverter {
  private ST_MarkerCoordinateConverter() {
  }

  public static ST_MarkerCoordinateModel fromDocx4j(Double value) {
    if (value == null) return null;
    return new ST_MarkerCoordinateModel(value);
  }

  public static Double toDocx4j(ST_MarkerCoordinateModel value) {
    return null;
  }
}
