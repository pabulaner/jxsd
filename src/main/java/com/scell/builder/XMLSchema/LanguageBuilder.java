package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.LanguageModel;

public class LanguageBuilder {
  private String value;

  public LanguageBuilder() {
    this.value = null;
  }

  public LanguageBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public LanguageBuilder from(LanguageModel value) {
    this.value = value.getValue();
    return this;
  }

  public LanguageModel build() {
    return new LanguageModel(this.value);
  }
}
