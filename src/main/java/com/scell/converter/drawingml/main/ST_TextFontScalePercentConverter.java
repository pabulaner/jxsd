package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextFontScalePercentModel;

public class ST_TextFontScalePercentConverter {
  private ST_TextFontScalePercentConverter() {
  }

  public static ST_TextFontScalePercentModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_TextFontScalePercentModel(value);
  }

  public static Long toDocx4j(ST_TextFontScalePercentModel value) {
    return null;
  }
}
