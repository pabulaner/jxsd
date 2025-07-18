package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextIndentModel;

public class ST_TextIndentConverter {
  private ST_TextIndentConverter() {
  }

  public static ST_TextIndentModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_TextIndentModel(value);
  }

  public static Long toDocx4J(ST_TextIndentModel value) {
    return null;
  }
}
