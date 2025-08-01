package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.StyleValueModel;

public class StyleValueConverter {
  private StyleValueConverter() {
  }

  public static StyleValueModel fromDocx4J(Short value) {
    if (value == null) return null;
    return new StyleValueModel(value);
  }
}
