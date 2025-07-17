package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextLanguageIDModel;

public class ST_TextLanguageIDConverter {
  private ST_TextLanguageIDConverter() {
  }

  public static ST_TextLanguageIDModel fromDocx4j(String value) {
    if (value == null) return null;
    return new ST_TextLanguageIDModel(value);
  }

  public static String toDocx4j(ST_TextLanguageIDModel value) {
    return null;
  }
}
