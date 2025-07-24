package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextFontScalePercentModel;

public class TextFontScalePercentConverter {
  private TextFontScalePercentConverter() {
  }

  public static TextFontScalePercentModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextFontScalePercentModel(value);
  }
}
