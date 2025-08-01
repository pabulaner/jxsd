package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextFontScalePercentValueModel;

public class TextFontScalePercentValueConverter {
  private TextFontScalePercentValueConverter() {
  }

  public static TextFontScalePercentValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextFontScalePercentValueModel(value);
  }
}
