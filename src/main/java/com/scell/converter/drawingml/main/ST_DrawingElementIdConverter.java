package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_DrawingElementIdModel;

public class ST_DrawingElementIdConverter {
  private ST_DrawingElementIdConverter() {
  }

  public static ST_DrawingElementIdModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_DrawingElementIdModel(value);
  }

  public static Long toDocx4j(ST_DrawingElementIdModel value) {
    return null;
  }
}
