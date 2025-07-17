package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.UnsignedByteModel;

public class UnsignedByteConverter {
  private UnsignedByteConverter() {
  }

  public static UnsignedByteModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new UnsignedByteModel(value);
  }

  public static Long toDocx4j(UnsignedByteModel value) {
    return null;
  }
}
