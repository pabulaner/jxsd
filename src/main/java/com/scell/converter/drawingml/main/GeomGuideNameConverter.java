package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideNameModel;

public class GeomGuideNameConverter {
  private GeomGuideNameConverter() {
  }

  public static GeomGuideNameModel fromDocx4J(String value) {
    if (value == null) return null;
    return new GeomGuideNameModel(value);
  }
}
