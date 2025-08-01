package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.LanguageValueModel;

public class LanguageValueConverter {
  private LanguageValueConverter() {
  }

  public static LanguageValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new LanguageValueModel(value);
  }
}
