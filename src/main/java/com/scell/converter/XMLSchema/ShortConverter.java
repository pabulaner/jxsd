package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.ShortModel;

public class ShortConverter {
  private ShortConverter() {
  }

  public static ShortModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ShortModel(value);
  }

  public static Long toDocx4J(ShortModel value) {
    return null;
  }
}
