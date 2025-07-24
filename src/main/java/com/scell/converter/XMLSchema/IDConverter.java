package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IDModel;

public class IDConverter {
  private IDConverter() {
  }

  public static IDModel fromDocx4J(String value) {
    if (value == null) return null;
    return new IDModel(value);
  }
}
