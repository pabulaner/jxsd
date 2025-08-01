package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.HexBinaryValueModel;

public class HexBinaryValueConverter {
  private HexBinaryValueConverter() {
  }

  public static HexBinaryValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new HexBinaryValueModel(value);
  }
}
