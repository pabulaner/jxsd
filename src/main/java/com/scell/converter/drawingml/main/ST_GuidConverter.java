package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_GuidModel;

public class ST_GuidConverter {
  private ST_GuidConverter() {
  }

  public static ST_GuidModel fromDocx4j(String value) {
    if (value == null) return null;
    return new ST_GuidModel(value);
  }

  public static String toDocx4j(ST_GuidModel value) {
    return null;
  }
}
