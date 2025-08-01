package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.MarkerSizeValueModel;

public class MarkerSizeValueConverter {
  private MarkerSizeValueConverter() {
  }

  public static MarkerSizeValueModel fromDocx4J(Short value) {
    if (value == null) return null;
    return new MarkerSizeValueModel(value);
  }
}
