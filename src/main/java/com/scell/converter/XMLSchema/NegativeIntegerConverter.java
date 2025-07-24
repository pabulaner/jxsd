package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NegativeIntegerModel;

public class NegativeIntegerConverter {
  private NegativeIntegerConverter() {
  }

  public static NegativeIntegerModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new NegativeIntegerModel(value);
  }
}
