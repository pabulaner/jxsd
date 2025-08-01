package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PositiveCoordinate32ValueModel;

public class PositiveCoordinate32ValueConverter {
  private PositiveCoordinate32ValueConverter() {
  }

  public static PositiveCoordinate32ValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new PositiveCoordinate32ValueModel(value);
  }
}
