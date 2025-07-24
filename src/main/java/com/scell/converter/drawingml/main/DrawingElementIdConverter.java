package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.DrawingElementIdModel;

public class DrawingElementIdConverter {
  private DrawingElementIdConverter() {
  }

  public static DrawingElementIdModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new DrawingElementIdModel(value);
  }
}
