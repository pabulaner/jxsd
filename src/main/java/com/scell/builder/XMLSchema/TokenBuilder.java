package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.TokenModel;

public class TokenBuilder {
  private String value;

  public TokenBuilder() {
    this.value = null;
  }

  public TokenBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public TokenBuilder from(TokenModel value) {
    this.value = value.getValue();
    return this;
  }

  public TokenModel build() {
    return new TokenModel(this.value);
  }
}
