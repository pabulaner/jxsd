package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.FloatModel;

public class FloatConverter {
  private FloatConverter() {
  }

  public static FloatModel fromDocx4j(Float value) {
    if (value == null) return null;
    return new FloatModel(value);
  }

  public static Float toDocx4j(FloatModel value) {
    return null;
  }
}
