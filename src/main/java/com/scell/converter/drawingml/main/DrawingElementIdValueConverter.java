package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.DrawingElementIdValueModel;

public class DrawingElementIdValueConverter {
  private DrawingElementIdValueConverter() {
  }

  public static DrawingElementIdValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new DrawingElementIdValueModel(value);
  }
}
