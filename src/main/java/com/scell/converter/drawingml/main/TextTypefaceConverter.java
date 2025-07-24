package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextTypefaceModel;

public class TextTypefaceConverter {
  private TextTypefaceConverter() {
  }

  public static TextTypefaceModel fromDocx4J(String value) {
    if (value == null) return null;
    return new TextTypefaceModel(value);
  }
}
