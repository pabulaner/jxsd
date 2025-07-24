package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NonNegativeIntegerModel;

public class NonNegativeIntegerConverter {
  private NonNegativeIntegerConverter() {
  }

  public static NonNegativeIntegerModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new NonNegativeIntegerModel(value);
  }
}
