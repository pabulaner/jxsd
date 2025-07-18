package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_GuidModel;

public class ST_GuidConverter {
  private ST_GuidConverter() {
  }

  public static ST_GuidModel fromDocx4J(String value) {
    if (value == null) return null;
    return new ST_GuidModel(value);
  }

  public static String toDocx4J(ST_GuidModel value) {
    return null;
  }
}
