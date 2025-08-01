package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextMarginValueModel;

public class TextMarginValueConverter {
  private TextMarginValueConverter() {
  }

  public static TextMarginValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextMarginValueModel(value);
  }
}
