package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IDModel;

public class IDConverter {
  private IDConverter() {
  }

  public static IDModel fromDocx4J(String value) {
    if (value == null) return null;
    return new IDModel(value);
  }

  public static String toDocx4J(IDModel value) {
    return null;
  }
}
