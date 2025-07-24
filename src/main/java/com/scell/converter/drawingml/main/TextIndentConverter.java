package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextIndentModel;

public class TextIndentConverter {
  private TextIndentConverter() {
  }

  public static TextIndentModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextIndentModel(value);
  }
}
