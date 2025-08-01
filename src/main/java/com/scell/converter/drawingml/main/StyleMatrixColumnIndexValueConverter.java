package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.StyleMatrixColumnIndexValueModel;

public class StyleMatrixColumnIndexValueConverter {
  private StyleMatrixColumnIndexValueConverter() {
  }

  public static StyleMatrixColumnIndexValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new StyleMatrixColumnIndexValueModel(value);
  }
}
