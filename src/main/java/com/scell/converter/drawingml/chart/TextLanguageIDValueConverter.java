package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.TextLanguageIDValueModel;

public class TextLanguageIDValueConverter {
  private TextLanguageIDValueConverter() {
  }

  public static TextLanguageIDValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new TextLanguageIDValueModel(value);
  }
}
