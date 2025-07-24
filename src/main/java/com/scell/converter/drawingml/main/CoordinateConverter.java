package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CoordinateModel;

public class CoordinateConverter {
  private CoordinateConverter() {
  }

  public static CoordinateModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new CoordinateModel(value);
  }
}
