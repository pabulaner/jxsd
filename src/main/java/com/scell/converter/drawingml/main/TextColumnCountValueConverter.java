package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextColumnCountValueModel;

public class TextColumnCountValueConverter {
  private TextColumnCountValueConverter() {
  }

  public static TextColumnCountValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextColumnCountValueModel(value);
  }
}
