package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.TokenModel;

public class TokenConverter {
  private TokenConverter() {
  }

  public static TokenModel fromDocx4J(String value) {
    if (value == null) return null;
    return new TokenModel(value);
  }
}
