package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.LongValueModel;

public class LongValueConverter {
  private LongValueConverter() {
  }

  public static LongValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new LongValueModel(value);
  }
}
