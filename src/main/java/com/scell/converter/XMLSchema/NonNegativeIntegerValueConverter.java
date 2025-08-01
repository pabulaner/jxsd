package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NonNegativeIntegerValueModel;

public class NonNegativeIntegerValueConverter {
  private NonNegativeIntegerValueConverter() {
  }

  public static NonNegativeIntegerValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new NonNegativeIntegerValueModel(value);
  }
}
