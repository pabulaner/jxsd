package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IntValueModel;

public class IntValueConverter {
  private IntValueConverter() {
  }

  public static IntValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new IntValueModel(value);
  }
}
