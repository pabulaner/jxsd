package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextIndentLevelTypeModel;

public class TextIndentLevelTypeConverter {
  private TextIndentLevelTypeConverter() {
  }

  public static TextIndentLevelTypeModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextIndentLevelTypeModel(value);
  }
}
