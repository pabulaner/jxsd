package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IntModel;

public class IntConverter {
  private IntConverter() {
  }

  public static IntModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new IntModel(value);
  }

  public static Long toDocx4J(IntModel value) {
    return null;
  }
}
