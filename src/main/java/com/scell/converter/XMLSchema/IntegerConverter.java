package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IntegerModel;

public class IntegerConverter {
  private IntegerConverter() {
  }

  public static IntegerModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new IntegerModel(value);
  }
}
