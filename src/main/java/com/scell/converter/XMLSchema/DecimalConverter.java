package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DecimalModel;

public class DecimalConverter {
  private DecimalConverter() {
  }

  public static DecimalModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new DecimalModel(value);
  }

  public static Long toDocx4j(DecimalModel value) {
    return null;
  }
}
