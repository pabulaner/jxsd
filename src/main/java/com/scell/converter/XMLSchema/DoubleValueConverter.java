package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DoubleValueModel;

public class DoubleValueConverter {
  private DoubleValueConverter() {
  }

  public static DoubleValueModel fromDocx4J(Double value) {
    if (value == null) return null;
    return new DoubleValueModel(value);
  }
}
