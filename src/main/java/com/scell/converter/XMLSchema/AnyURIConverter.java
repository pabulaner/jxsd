package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.AnyURIModel;

public class AnyURIConverter {
  private AnyURIConverter() {
  }

  public static AnyURIModel fromDocx4j(String value) {
    if (value == null) return null;
    return new AnyURIModel(value);
  }

  public static String toDocx4j(AnyURIModel value) {
    return null;
  }
}
