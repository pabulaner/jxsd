package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.UnsignedLongValueModel;

public class UnsignedLongValueConverter {
  private UnsignedLongValueConverter() {
  }

  public static UnsignedLongValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new UnsignedLongValueModel(value);
  }
}
