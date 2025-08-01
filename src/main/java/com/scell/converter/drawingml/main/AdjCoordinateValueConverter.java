package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AdjCoordinateValueModel;
import java.lang.String;

public class AdjCoordinateValueConverter {
  private AdjCoordinateValueConverter() {
  }

  public static AdjCoordinateValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new AdjCoordinateValueModel(value);
  }
}
