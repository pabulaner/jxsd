package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextMarginModel;

public class TextMarginConverter {
  private TextMarginConverter() {
  }

  public static TextMarginModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextMarginModel(value);
  }
}
