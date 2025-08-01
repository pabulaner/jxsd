package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.RotXValueModel;

public class RotXValueConverter {
  private RotXValueConverter() {
  }

  public static RotXValueModel fromDocx4J(Byte value) {
    if (value == null) return null;
    return new RotXValueModel(value);
  }
}
