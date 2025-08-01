package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.GapAmountValueModel;

public class GapAmountValueConverter {
  private GapAmountValueConverter() {
  }

  public static GapAmountValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new GapAmountValueModel(value);
  }
}
