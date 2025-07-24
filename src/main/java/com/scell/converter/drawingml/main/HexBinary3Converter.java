package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.HexBinary3Model;

public class HexBinary3Converter {
  private HexBinary3Converter() {
  }

  public static HexBinary3Model fromDocx4J(String value) {
    if (value == null) return null;
    return new HexBinary3Model(value);
  }
}
