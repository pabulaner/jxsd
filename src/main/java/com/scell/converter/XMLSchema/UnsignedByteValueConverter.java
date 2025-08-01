package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.UnsignedByteValueModel;

public class UnsignedByteValueConverter {
  private UnsignedByteValueConverter() {
  }

  public static UnsignedByteValueModel fromDocx4J(Short value) {
    if (value == null) return null;
    return new UnsignedByteValueModel(value);
  }
}
