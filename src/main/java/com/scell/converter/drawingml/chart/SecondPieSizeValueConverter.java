package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.SecondPieSizeValueModel;

public class SecondPieSizeValueConverter {
  private SecondPieSizeValueConverter() {
  }

  public static SecondPieSizeValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new SecondPieSizeValueModel(value);
  }
}
