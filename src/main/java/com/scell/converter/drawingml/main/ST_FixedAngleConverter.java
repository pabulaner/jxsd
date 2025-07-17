package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_FixedAngleModel;

public class ST_FixedAngleConverter {
  private ST_FixedAngleConverter() {
  }

  public static ST_FixedAngleModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_FixedAngleModel(value);
  }

  public static Long toDocx4j(ST_FixedAngleModel value) {
    return null;
  }
}
