package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedAngleValueModel;

public class PositiveFixedAngleValueConverter {
  private PositiveFixedAngleValueConverter() {
  }

  public static PositiveFixedAngleValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new PositiveFixedAngleValueModel(value);
  }
}
