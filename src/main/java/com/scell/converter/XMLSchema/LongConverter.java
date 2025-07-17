package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.LongModel;

public class LongConverter {
  private LongConverter() {
  }

  public static LongModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new LongModel(value);
  }

  public static Long toDocx4j(LongModel value) {
    return null;
  }
}
