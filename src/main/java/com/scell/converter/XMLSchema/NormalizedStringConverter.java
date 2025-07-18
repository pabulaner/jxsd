package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NormalizedStringModel;

public class NormalizedStringConverter {
  private NormalizedStringConverter() {
  }

  public static NormalizedStringModel fromDocx4J(String value) {
    if (value == null) return null;
    return new NormalizedStringModel(value);
  }

  public static String toDocx4J(NormalizedStringModel value) {
    return null;
  }
}
