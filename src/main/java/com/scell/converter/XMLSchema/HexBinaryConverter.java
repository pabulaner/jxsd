package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.HexBinaryModel;

public class HexBinaryConverter {
  private HexBinaryConverter() {
  }

  public static HexBinaryModel fromDocx4J(String value) {
    if (value == null) return null;
    return new HexBinaryModel(value);
  }
}
