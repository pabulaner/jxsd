package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.TokenValueModel;

public class TokenValueBuilder {
  private String value;

  public TokenValueBuilder() {
  }

  public TokenValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public TokenValueBuilder from(TokenValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TokenValueModel build() {
    return new TokenValueModel(this.value);
  }
}
