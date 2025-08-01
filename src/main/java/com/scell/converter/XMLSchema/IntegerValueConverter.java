package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IntegerValueModel;

public class IntegerValueConverter {
  private IntegerValueConverter() {
  }

  public static IntegerValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new IntegerValueModel(value);
  }
}
