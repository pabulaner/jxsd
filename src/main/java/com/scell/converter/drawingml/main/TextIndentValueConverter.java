package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextIndentValueModel;

public class TextIndentValueConverter {
  private TextIndentValueConverter() {
  }

  public static TextIndentValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextIndentValueModel(value);
  }
}
