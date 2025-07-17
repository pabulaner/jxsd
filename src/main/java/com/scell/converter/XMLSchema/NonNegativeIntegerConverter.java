package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NonNegativeIntegerModel;

public class NonNegativeIntegerConverter {
  private NonNegativeIntegerConverter() {
  }

  public static NonNegativeIntegerModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new NonNegativeIntegerModel(value);
  }

  public static Long toDocx4j(NonNegativeIntegerModel value) {
    return null;
  }
}
