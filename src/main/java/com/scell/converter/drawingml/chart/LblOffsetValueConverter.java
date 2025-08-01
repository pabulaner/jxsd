package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LblOffsetValueModel;

public class LblOffsetValueConverter {
  private LblOffsetValueConverter() {
  }

  public static LblOffsetValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new LblOffsetValueModel(value);
  }
}
