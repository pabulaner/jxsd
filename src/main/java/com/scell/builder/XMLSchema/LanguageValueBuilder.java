package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.LanguageValueModel;

public class LanguageValueBuilder {
  private String value;

  public LanguageValueBuilder() {
  }

  public LanguageValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public LanguageValueBuilder from(LanguageValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public LanguageValueModel build() {
    return new LanguageValueModel(this.value);
  }
}
