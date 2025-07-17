package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NameModel;

public class NameConverter {
  private NameConverter() {
  }

  public static NameModel fromDocx4j(String value) {
    if (value == null) return null;
    return new NameModel(value);
  }

  public static String toDocx4j(NameModel value) {
    return null;
  }
}
