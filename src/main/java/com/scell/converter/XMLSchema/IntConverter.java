package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IntModel;

public class IntConverter {
  private IntConverter() {
  }

  public static IntModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new IntModel(value);
  }

  public static Long toDocx4j(IntModel value) {
    return null;
  }
}
