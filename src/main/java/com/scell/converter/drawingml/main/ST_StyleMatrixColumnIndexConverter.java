package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_StyleMatrixColumnIndexModel;

public class ST_StyleMatrixColumnIndexConverter {
  private ST_StyleMatrixColumnIndexConverter() {
  }

  public static ST_StyleMatrixColumnIndexModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_StyleMatrixColumnIndexModel(value);
  }

  public static Long toDocx4j(ST_StyleMatrixColumnIndexModel value) {
    return null;
  }
}
