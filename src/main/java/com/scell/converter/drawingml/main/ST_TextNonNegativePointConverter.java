package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextNonNegativePointModel;

public class ST_TextNonNegativePointConverter {
  private ST_TextNonNegativePointConverter() {
  }

  public static ST_TextNonNegativePointModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_TextNonNegativePointModel(value);
  }

  public static Long toDocx4j(ST_TextNonNegativePointModel value) {
    return null;
  }
}
