package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextSpacingPointModel;

public class ST_TextSpacingPointConverter {
  private ST_TextSpacingPointConverter() {
  }

  public static ST_TextSpacingPointModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_TextSpacingPointModel(value);
  }

  public static Long toDocx4j(ST_TextSpacingPointModel value) {
    return null;
  }
}
