package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.HPercentValueModel;

public class HPercentValueConverter {
  private HPercentValueConverter() {
  }

  public static HPercentValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new HPercentValueModel(value);
  }
}
