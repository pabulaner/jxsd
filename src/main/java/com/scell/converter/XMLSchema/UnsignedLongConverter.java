package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.UnsignedLongModel;

public class UnsignedLongConverter {
  private UnsignedLongConverter() {
  }

  public static UnsignedLongModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new UnsignedLongModel(value);
  }

  public static Long toDocx4J(UnsignedLongModel value) {
    return null;
  }
}
