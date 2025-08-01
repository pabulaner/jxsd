package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CoordinateValueModel;

public class CoordinateValueConverter {
  private CoordinateValueConverter() {
  }

  public static CoordinateValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new CoordinateValueModel(value);
  }
}
