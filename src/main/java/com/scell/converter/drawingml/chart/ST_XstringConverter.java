package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_XstringModel;

public class ST_XstringConverter {
  private ST_XstringConverter() {
  }

  public static ST_XstringModel fromDocx4J(String value) {
    if (value == null) return null;
    return new ST_XstringModel(value);
  }

  public static String toDocx4J(ST_XstringModel value) {
    return null;
  }
}
