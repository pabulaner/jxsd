package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DoubleModel;

public class DoubleConverter {
  private DoubleConverter() {
  }

  public static DoubleModel fromDocx4J(Double value) {
    if (value == null) return null;
    return new DoubleModel(value);
  }
}
