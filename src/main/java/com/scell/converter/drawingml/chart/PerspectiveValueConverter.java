package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PerspectiveValueModel;

public class PerspectiveValueConverter {
  private PerspectiveValueConverter() {
  }

  public static PerspectiveValueModel fromDocx4J(Short value) {
    if (value == null) return null;
    return new PerspectiveValueModel(value);
  }
}
