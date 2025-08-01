package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextLanguageIDValueModel;

public class TextLanguageIDValueConverter {
  private TextLanguageIDValueConverter() {
  }

  public static TextLanguageIDValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new TextLanguageIDValueModel(value);
  }
}
