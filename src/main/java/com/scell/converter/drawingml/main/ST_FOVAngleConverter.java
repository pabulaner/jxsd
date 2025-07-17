package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_FOVAngleModel;

public class ST_FOVAngleConverter {
  private ST_FOVAngleConverter() {
  }

  public static ST_FOVAngleModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_FOVAngleModel(value);
  }

  public static Long toDocx4j(ST_FOVAngleModel value) {
    return null;
  }
}
