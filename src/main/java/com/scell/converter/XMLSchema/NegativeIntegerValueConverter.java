package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NegativeIntegerValueModel;

public class NegativeIntegerValueConverter {
  private NegativeIntegerValueConverter() {
  }

  public static NegativeIntegerValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new NegativeIntegerValueModel(value);
  }
}
