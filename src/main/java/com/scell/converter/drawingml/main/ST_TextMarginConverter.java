package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextMarginModel;

public class ST_TextMarginConverter {
  private ST_TextMarginConverter() {
  }

  public static ST_TextMarginModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_TextMarginModel(value);
  }

  public static Long toDocx4j(ST_TextMarginModel value) {
    return null;
  }
}
