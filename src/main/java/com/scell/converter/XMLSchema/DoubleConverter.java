package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DoubleModel;

public class DoubleConverter {
  private DoubleConverter() {
  }

  public static DoubleModel fromDocx4j(Double value) {
    if (value == null) return null;
    return new DoubleModel(value);
  }

  public static Double toDocx4j(DoubleModel value) {
    return null;
  }
}
