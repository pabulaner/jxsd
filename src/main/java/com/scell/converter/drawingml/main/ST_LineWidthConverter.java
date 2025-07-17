package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_LineWidthModel;

public class ST_LineWidthConverter {
  private ST_LineWidthConverter() {
  }

  public static ST_LineWidthModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_LineWidthModel(value);
  }

  public static Long toDocx4j(ST_LineWidthModel value) {
    return null;
  }
}
