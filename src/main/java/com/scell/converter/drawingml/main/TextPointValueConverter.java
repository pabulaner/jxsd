package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextPointValueModel;

public class TextPointValueConverter {
  private TextPointValueConverter() {
  }

  public static TextPointValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextPointValueModel(value);
  }
}
