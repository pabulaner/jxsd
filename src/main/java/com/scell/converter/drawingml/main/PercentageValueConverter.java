package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PercentageValueModel;

public class PercentageValueConverter {
  private PercentageValueConverter() {
  }

  public static PercentageValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new PercentageValueModel(value);
  }
}
