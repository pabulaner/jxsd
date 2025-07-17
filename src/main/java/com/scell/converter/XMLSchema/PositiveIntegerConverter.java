package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.PositiveIntegerModel;

public class PositiveIntegerConverter {
  private PositiveIntegerConverter() {
  }

  public static PositiveIntegerModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new PositiveIntegerModel(value);
  }

  public static Long toDocx4j(PositiveIntegerModel value) {
    return null;
  }
}
