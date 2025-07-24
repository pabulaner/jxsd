package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextPointModel;

public class TextPointConverter {
  private TextPointConverter() {
  }

  public static TextPointModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextPointModel(value);
  }
}
