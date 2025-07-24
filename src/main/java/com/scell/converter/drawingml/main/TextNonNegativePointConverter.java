package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextNonNegativePointModel;

public class TextNonNegativePointConverter {
  private TextNonNegativePointConverter() {
  }

  public static TextNonNegativePointModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextNonNegativePointModel(value);
  }
}
