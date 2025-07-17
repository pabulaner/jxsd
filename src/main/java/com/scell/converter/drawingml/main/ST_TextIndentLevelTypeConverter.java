package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextIndentLevelTypeModel;

public class ST_TextIndentLevelTypeConverter {
  private ST_TextIndentLevelTypeConverter() {
  }

  public static ST_TextIndentLevelTypeModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_TextIndentLevelTypeModel(value);
  }

  public static Long toDocx4j(ST_TextIndentLevelTypeModel value) {
    return null;
  }
}
