package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_TextLanguageIDModel;

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
