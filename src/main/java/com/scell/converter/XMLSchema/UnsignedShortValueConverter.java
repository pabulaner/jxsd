package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.UnsignedShortValueModel;

public class UnsignedShortValueConverter {
  private UnsignedShortValueConverter() {
  }

  public static UnsignedShortValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new UnsignedShortValueModel(value);
  }
}
