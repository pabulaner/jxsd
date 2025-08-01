package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.FloatValueModel;

public class FloatValueConverter {
  private FloatValueConverter() {
  }

  public static FloatValueModel fromDocx4J(Float value) {
    if (value == null) return null;
    return new FloatValueModel(value);
  }
}
