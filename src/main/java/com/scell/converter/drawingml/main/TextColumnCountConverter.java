package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextColumnCountModel;

public class TextColumnCountConverter {
  private TextColumnCountConverter() {
  }

  public static TextColumnCountModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextColumnCountModel(value);
  }
}
