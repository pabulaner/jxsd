package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedPercentageValueModel;

public class PositiveFixedPercentageValueConverter {
  private PositiveFixedPercentageValueConverter() {
  }

  public static PositiveFixedPercentageValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new PositiveFixedPercentageValueModel(value);
  }
}
