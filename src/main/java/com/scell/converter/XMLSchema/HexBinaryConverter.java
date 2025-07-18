package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.HexBinaryModel;

public class HexBinaryConverter {
  private HexBinaryConverter() {
  }

  public static HexBinaryModel fromDocx4J(byte[] value) {
    if (value == null) return null;
    return new HexBinaryModel(value);
  }

  public static byte[] toDocx4J(HexBinaryModel value) {
    return null;
  }
}
