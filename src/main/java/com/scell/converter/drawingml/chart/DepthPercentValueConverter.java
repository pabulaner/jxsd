package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.DepthPercentValueModel;

public class DepthPercentValueConverter {
  private DepthPercentValueConverter() {
  }

  public static DepthPercentValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new DepthPercentValueModel(value);
  }
}
