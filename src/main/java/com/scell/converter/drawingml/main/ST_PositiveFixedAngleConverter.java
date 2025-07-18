package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PositiveFixedAngleModel;

public class ST_PositiveFixedAngleConverter {
  private ST_PositiveFixedAngleConverter() {
  }

  public static ST_PositiveFixedAngleModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_PositiveFixedAngleModel(value);
  }

  public static Long toDocx4J(ST_PositiveFixedAngleModel value) {
    return null;
  }
}
