package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.StyleMatrixColumnIndexModel;

public class StyleMatrixColumnIndexConverter {
  private StyleMatrixColumnIndexConverter() {
  }

  public static StyleMatrixColumnIndexModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new StyleMatrixColumnIndexModel(value);
  }
}
