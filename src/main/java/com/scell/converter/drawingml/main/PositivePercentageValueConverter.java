package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PositivePercentageValueModel;

public class PositivePercentageValueConverter {
  private PositivePercentageValueConverter() {
  }

  public static PositivePercentageValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new PositivePercentageValueModel(value);
  }
}
