package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextTypefaceValueModel;

public class TextTypefaceValueConverter {
  private TextTypefaceValueConverter() {
  }

  public static TextTypefaceValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new TextTypefaceValueModel(value);
  }
}
