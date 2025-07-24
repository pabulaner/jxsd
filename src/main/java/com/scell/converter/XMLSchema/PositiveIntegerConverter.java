package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.PositiveIntegerModel;

public class PositiveIntegerConverter {
  private PositiveIntegerConverter() {
  }

  public static PositiveIntegerModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new PositiveIntegerModel(value);
  }
}
