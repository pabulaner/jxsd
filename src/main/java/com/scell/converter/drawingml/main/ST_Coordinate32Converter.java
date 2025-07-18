package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_Coordinate32Model;

public class ST_Coordinate32Converter {
  private ST_Coordinate32Converter() {
  }

  public static ST_Coordinate32Model fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_Coordinate32Model(value);
  }

  public static Long toDocx4J(ST_Coordinate32Model value) {
    return null;
  }
}
