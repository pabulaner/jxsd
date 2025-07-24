package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextLanguageIDModel;

public class TextLanguageIDConverter {
  private TextLanguageIDConverter() {
  }

  public static TextLanguageIDModel fromDocx4J(String value) {
    if (value == null) return null;
    return new TextLanguageIDModel(value);
  }
}
