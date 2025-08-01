package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.FirstSliceAngValueModel;

public class FirstSliceAngValueConverter {
  private FirstSliceAngValueConverter() {
  }

  public static FirstSliceAngValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new FirstSliceAngValueModel(value);
  }
}
