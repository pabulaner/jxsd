package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.FloatModel;

public class FloatConverter {
  private FloatConverter() {
  }

  public static FloatModel fromDocx4J(Float value) {
    if (value == null) return null;
    return new FloatModel(value);
  }
}
