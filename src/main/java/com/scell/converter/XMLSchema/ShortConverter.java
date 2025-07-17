package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.ShortModel;

public class ShortConverter {
  private ShortConverter() {
  }

  public static ShortModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ShortModel(value);
  }

  public static Long toDocx4j(ShortModel value) {
    return null;
  }
}
