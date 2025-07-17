package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NegativeIntegerModel;

public class NegativeIntegerConverter {
  private NegativeIntegerConverter() {
  }

  public static NegativeIntegerModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new NegativeIntegerModel(value);
  }

  public static Long toDocx4j(NegativeIntegerModel value) {
    return null;
  }
}
