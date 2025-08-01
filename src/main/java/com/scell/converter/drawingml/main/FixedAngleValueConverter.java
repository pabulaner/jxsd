package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FixedAngleValueModel;

public class FixedAngleValueConverter {
  private FixedAngleValueConverter() {
  }

  public static FixedAngleValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new FixedAngleValueModel(value);
  }
}
