package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.PositiveIntegerValueModel;

public class PositiveIntegerValueConverter {
  private PositiveIntegerValueConverter() {
  }

  public static PositiveIntegerValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new PositiveIntegerValueModel(value);
  }
}
