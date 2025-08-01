package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.TokenValueModel;

public class TokenValueConverter {
  private TokenValueConverter() {
  }

  public static TokenValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new TokenValueModel(value);
  }
}
