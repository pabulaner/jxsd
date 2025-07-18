package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextTypefaceModel;

public class ST_TextTypefaceConverter {
  private ST_TextTypefaceConverter() {
  }

  public static ST_TextTypefaceModel fromDocx4J(String value) {
    if (value == null) return null;
    return new ST_TextTypefaceModel(value);
  }

  public static String toDocx4J(ST_TextTypefaceModel value) {
    return null;
  }
}
