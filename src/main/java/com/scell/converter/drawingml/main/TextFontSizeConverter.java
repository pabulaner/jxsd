package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextFontSizeModel;

public class TextFontSizeConverter {
  private TextFontSizeConverter() {
  }

  public static TextFontSizeModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextFontSizeModel(value);
  }
}
