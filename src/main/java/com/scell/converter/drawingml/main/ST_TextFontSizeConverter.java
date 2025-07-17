package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextFontSizeModel;

public class ST_TextFontSizeConverter {
  private ST_TextFontSizeConverter() {
  }

  public static ST_TextFontSizeModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_TextFontSizeModel(value);
  }

  public static Long toDocx4j(ST_TextFontSizeModel value) {
    return null;
  }
}
