package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextLanguageIDModel;

public class ST_TextLanguageIDConverter {
  private ST_TextLanguageIDConverter() {
  }

  public static ST_TextLanguageIDModel fromDocx4J(String value) {
    if (value == null) return null;
    return new ST_TextLanguageIDModel(value);
  }

  public static String toDocx4J(ST_TextLanguageIDModel value) {
    return null;
  }
}
