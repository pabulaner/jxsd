package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextIndentLevelTypeValueModel;

public class TextIndentLevelTypeValueConverter {
  private TextIndentLevelTypeValueConverter() {
  }

  public static TextIndentLevelTypeValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextIndentLevelTypeValueModel(value);
  }
}
