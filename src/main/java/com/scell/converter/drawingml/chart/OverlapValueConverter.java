package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.OverlapValueModel;

public class OverlapValueConverter {
  private OverlapValueConverter() {
  }

  public static OverlapValueModel fromDocx4J(Byte value) {
    if (value == null) return null;
    return new OverlapValueModel(value);
  }
}
