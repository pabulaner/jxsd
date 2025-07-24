package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineWidthModel;

public class LineWidthConverter {
  private LineWidthConverter() {
  }

  public static LineWidthModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new LineWidthModel(value);
  }
}
