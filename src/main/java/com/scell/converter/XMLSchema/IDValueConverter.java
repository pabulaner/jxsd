package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IDValueModel;

public class IDValueConverter {
  private IDValueConverter() {
  }

  public static IDValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new IDValueModel(value);
  }
}
