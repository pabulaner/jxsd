package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NonPositiveIntegerModel;

public class NonPositiveIntegerConverter {
  private NonPositiveIntegerConverter() {
  }

  public static NonPositiveIntegerModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new NonPositiveIntegerModel(value);
  }
}
