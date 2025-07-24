package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PanoseModel;

public class PanoseConverter {
  private PanoseConverter() {
  }

  public static PanoseModel fromDocx4J(String value) {
    if (value == null) return null;
    return new PanoseModel(value);
  }
}
