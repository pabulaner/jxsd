package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FixedAngleModel;

public class FixedAngleConverter {
  private FixedAngleConverter() {
  }

  public static FixedAngleModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new FixedAngleModel(value);
  }
}
