package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextPointModel;

public class ST_TextPointConverter {
  private ST_TextPointConverter() {
  }

  public static ST_TextPointModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_TextPointModel(value);
  }

  public static Long toDocx4J(ST_TextPointModel value) {
    return null;
  }
}
