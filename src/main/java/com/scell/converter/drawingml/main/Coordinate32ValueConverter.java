package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Coordinate32ValueModel;

public class Coordinate32ValueConverter {
  private Coordinate32ValueConverter() {
  }

  public static Coordinate32ValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new Coordinate32ValueModel(value);
  }
}
