package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextColumnCountModel;

public class ST_TextColumnCountConverter {
  private ST_TextColumnCountConverter() {
  }

  public static ST_TextColumnCountModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_TextColumnCountModel(value);
  }

  public static Long toDocx4J(ST_TextColumnCountModel value) {
    return null;
  }
}
