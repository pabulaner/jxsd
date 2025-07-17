package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextIndentModel;

public class ST_TextIndentConverter {
  private ST_TextIndentConverter() {
  }

  public static ST_TextIndentModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_TextIndentModel(value);
  }

  public static Long toDocx4j(ST_TextIndentModel value) {
    return null;
  }
}
