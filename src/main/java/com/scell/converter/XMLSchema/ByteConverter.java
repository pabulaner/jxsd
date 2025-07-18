package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.ByteModel;

public class ByteConverter {
  private ByteConverter() {
  }

  public static ByteModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ByteModel(value);
  }

  public static Long toDocx4J(ByteModel value) {
    return null;
  }
}
