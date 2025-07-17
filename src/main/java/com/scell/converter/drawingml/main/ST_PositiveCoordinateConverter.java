package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;

public class ST_PositiveCoordinateConverter {
  private ST_PositiveCoordinateConverter() {
  }

  public static ST_PositiveCoordinateModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_PositiveCoordinateModel(value);
  }

  public static Long toDocx4j(ST_PositiveCoordinateModel value) {
    return null;
  }
}
