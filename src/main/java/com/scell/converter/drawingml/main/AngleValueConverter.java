package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AngleValueModel;

public class AngleValueConverter {
  private AngleValueConverter() {
  }

  public static AngleValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new AngleValueModel(value);
  }
}
