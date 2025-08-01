package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FOVAngleValueModel;

public class FOVAngleValueConverter {
  private FOVAngleValueConverter() {
  }

  public static FOVAngleValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new FOVAngleValueModel(value);
  }
}
