package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.LongModel;

public class LongConverter {
  private LongConverter() {
  }

  public static LongModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new LongModel(value);
  }
}
