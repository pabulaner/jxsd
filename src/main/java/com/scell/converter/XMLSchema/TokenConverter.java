package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.TokenModel;

public class TokenConverter {
  private TokenConverter() {
  }

  public static TokenModel fromDocx4j(String value) {
    if (value == null) return null;
    return new TokenModel(value);
  }

  public static String toDocx4j(TokenModel value) {
    return null;
  }
}
