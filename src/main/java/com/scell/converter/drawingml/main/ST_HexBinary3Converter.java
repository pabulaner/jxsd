package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_HexBinary3Model;

public class ST_HexBinary3Converter {
  private ST_HexBinary3Converter() {
  }

  public static ST_HexBinary3Model fromDocx4j(byte[] value) {
    if (value == null) return null;
    return new ST_HexBinary3Model(value);
  }

  public static byte[] toDocx4j(ST_HexBinary3Model value) {
    return null;
  }
}
