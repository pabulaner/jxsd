package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.HoleSizeValueModel;

public class HoleSizeValueConverter {
  private HoleSizeValueConverter() {
  }

  public static HoleSizeValueModel fromDocx4J(Short value) {
    if (value == null) return null;
    return new HoleSizeValueModel(value);
  }
}
