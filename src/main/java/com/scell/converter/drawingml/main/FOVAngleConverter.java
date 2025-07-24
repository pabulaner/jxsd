package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FOVAngleModel;

public class FOVAngleConverter {
  private FOVAngleConverter() {
  }

  public static FOVAngleModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new FOVAngleModel(value);
  }
}
