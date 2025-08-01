package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FixedPercentageValueModel;

public class FixedPercentageValueConverter {
  private FixedPercentageValueConverter() {
  }

  public static FixedPercentageValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new FixedPercentageValueModel(value);
  }
}
