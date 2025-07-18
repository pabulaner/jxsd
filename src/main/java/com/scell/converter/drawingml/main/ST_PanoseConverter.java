package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PanoseModel;

public class ST_PanoseConverter {
  private ST_PanoseConverter() {
  }

  public static ST_PanoseModel fromDocx4J(byte[] value) {
    if (value == null) return null;
    return new ST_PanoseModel(value);
  }

  public static byte[] toDocx4J(ST_PanoseModel value) {
    return null;
  }
}
