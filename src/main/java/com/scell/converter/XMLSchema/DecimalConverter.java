package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DecimalModel;

public class DecimalConverter {
  private DecimalConverter() {
  }

  public static DecimalModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new DecimalModel(value);
  }
}
