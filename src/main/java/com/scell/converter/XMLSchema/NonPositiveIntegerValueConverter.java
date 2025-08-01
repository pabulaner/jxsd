package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NonPositiveIntegerValueModel;

public class NonPositiveIntegerValueConverter {
  private NonPositiveIntegerValueConverter() {
  }

  public static NonPositiveIntegerValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new NonPositiveIntegerValueModel(value);
  }
}
