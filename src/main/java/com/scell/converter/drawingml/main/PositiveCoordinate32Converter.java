package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PositiveCoordinate32Model;

public class PositiveCoordinate32Converter {
  private PositiveCoordinate32Converter() {
  }

  public static PositiveCoordinate32Model fromDocx4J(Integer value) {
    if (value == null) return null;
    return new PositiveCoordinate32Model(value);
  }
}
