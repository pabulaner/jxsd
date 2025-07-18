package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.AnyURIModel;

public class AnyURIConverter {
  private AnyURIConverter() {
  }

  public static AnyURIModel fromDocx4J(String value) {
    if (value == null) return null;
    return new AnyURIModel(value);
  }

  public static String toDocx4J(AnyURIModel value) {
    return null;
  }
}
