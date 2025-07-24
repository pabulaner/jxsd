package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AdjCoordinateModel;
import java.lang.String;

public class AdjCoordinateConverter {
  private AdjCoordinateConverter() {
  }

  public static AdjCoordinateModel fromDocx4J(String value) {
    if (value == null) return null;
    return new AdjCoordinateModel(value);
  }
}
