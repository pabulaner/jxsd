package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextNonNegativePointValueModel;

public class TextNonNegativePointValueConverter {
  private TextNonNegativePointValueConverter() {
  }

  public static TextNonNegativePointValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextNonNegativePointValueModel(value);
  }
}
