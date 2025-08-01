package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DecimalValueModel;

public class DecimalValueConverter {
  private DecimalValueConverter() {
  }

  public static DecimalValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new DecimalValueModel(value);
  }
}
