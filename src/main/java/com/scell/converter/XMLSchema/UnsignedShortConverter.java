package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.UnsignedShortModel;

public class UnsignedShortConverter {
  private UnsignedShortConverter() {
  }

  public static UnsignedShortModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new UnsignedShortModel(value);
  }

  public static Long toDocx4j(UnsignedShortModel value) {
    return null;
  }
}
