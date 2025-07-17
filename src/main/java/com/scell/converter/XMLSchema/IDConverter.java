package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IDModel;

public class IDConverter {
  private IDConverter() {
  }

  public static IDModel fromDocx4j(String value) {
    if (value == null) return null;
    return new IDModel(value);
  }

  public static String toDocx4j(IDModel value) {
    return null;
  }
}
