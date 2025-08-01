package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextFontSizeValueModel;

public class TextFontSizeValueConverter {
  private TextFontSizeValueConverter() {
  }

  public static TextFontSizeValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextFontSizeValueModel(value);
  }
}
