package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.BooleanValueModel;

public class BooleanValueConverter {
  private BooleanValueConverter() {
  }

  public static BooleanValueModel fromDocx4J(Boolean value) {
    if (value == null) return null;
    return new BooleanValueModel(value);
  }
}
