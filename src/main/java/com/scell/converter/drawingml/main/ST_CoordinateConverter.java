package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_CoordinateModel;

public class ST_CoordinateConverter {
  private ST_CoordinateConverter() {
  }

  public static ST_CoordinateModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_CoordinateModel(value);
  }

  public static Long toDocx4j(ST_CoordinateModel value) {
    return null;
  }
}
