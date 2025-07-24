package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PositiveCoordinateModel;

public class PositiveCoordinateConverter {
  private PositiveCoordinateConverter() {
  }

  public static PositiveCoordinateModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new PositiveCoordinateModel(value);
  }
}
