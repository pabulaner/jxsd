package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextIndentLevelTypeModel;

public class ST_TextIndentLevelTypeConverter {
  private ST_TextIndentLevelTypeConverter() {
  }

  public static ST_TextIndentLevelTypeModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_TextIndentLevelTypeModel(value);
  }

  public static Long toDocx4J(ST_TextIndentLevelTypeModel value) {
    return null;
  }
}
