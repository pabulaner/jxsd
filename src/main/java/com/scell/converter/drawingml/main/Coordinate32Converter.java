package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Coordinate32Model;

public class Coordinate32Converter {
  private Coordinate32Converter() {
  }

  public static Coordinate32Model fromDocx4J(Integer value) {
    if (value == null) return null;
    return new Coordinate32Model(value);
  }
}
