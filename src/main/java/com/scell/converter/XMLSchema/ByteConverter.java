package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.ByteModel;

public class ByteConverter {
  private ByteConverter() {
  }

  public static ByteModel fromDocx4J(Byte value) {
    if (value == null) return null;
    return new ByteModel(value);
  }
}
