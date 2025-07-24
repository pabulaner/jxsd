package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AdjAngleModel;
import java.lang.String;

public class AdjAngleConverter {
  private AdjAngleConverter() {
  }

  public static AdjAngleModel fromDocx4J(String value) {
    if (value == null) return null;
    return new AdjAngleModel(value);
  }
}
