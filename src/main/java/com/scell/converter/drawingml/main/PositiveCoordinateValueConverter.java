package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PositiveCoordinateValueModel;

public class PositiveCoordinateValueConverter {
  private PositiveCoordinateValueConverter() {
  }

  public static PositiveCoordinateValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new PositiveCoordinateValueModel(value);
  }
}
