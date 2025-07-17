package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_AngleModel;

public class ST_AngleConverter {
  private ST_AngleConverter() {
  }

  public static ST_AngleModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_AngleModel(value);
  }

  public static Long toDocx4j(ST_AngleModel value) {
    return null;
  }
}
