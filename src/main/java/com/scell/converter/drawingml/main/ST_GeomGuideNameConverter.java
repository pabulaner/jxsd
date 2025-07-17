package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_GeomGuideNameModel;

public class ST_GeomGuideNameConverter {
  private ST_GeomGuideNameConverter() {
  }

  public static ST_GeomGuideNameModel fromDocx4j(String value) {
    if (value == null) return null;
    return new ST_GeomGuideNameModel(value);
  }

  public static String toDocx4j(ST_GeomGuideNameModel value) {
    return null;
  }
}
