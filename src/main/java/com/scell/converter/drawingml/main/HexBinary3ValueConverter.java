package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.HexBinary3ValueModel;

public class HexBinary3ValueConverter {
  private HexBinary3ValueConverter() {
  }

  public static HexBinary3ValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new HexBinary3ValueModel(value);
  }
}
