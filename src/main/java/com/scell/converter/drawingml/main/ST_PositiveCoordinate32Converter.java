package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PositiveCoordinate32Model;

public class ST_PositiveCoordinate32Converter {
  private ST_PositiveCoordinate32Converter() {
  }

  public static ST_PositiveCoordinate32Model fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_PositiveCoordinate32Model(value);
  }

  public static Long toDocx4J(ST_PositiveCoordinate32Model value) {
    return null;
  }
}
