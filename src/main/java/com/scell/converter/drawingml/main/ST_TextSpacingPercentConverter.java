package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextSpacingPercentModel;

public class ST_TextSpacingPercentConverter {
  private ST_TextSpacingPercentConverter() {
  }

  public static ST_TextSpacingPercentModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_TextSpacingPercentModel(value);
  }

  public static Long toDocx4j(ST_TextSpacingPercentModel value) {
    return null;
  }
}
