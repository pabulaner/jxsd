package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.LanguageModel;

public class LanguageConverter {
  private LanguageConverter() {
  }

  public static LanguageModel fromDocx4J(String value) {
    if (value == null) return null;
    return new LanguageModel(value);
  }

  public static String toDocx4J(LanguageModel value) {
    return null;
  }
}
