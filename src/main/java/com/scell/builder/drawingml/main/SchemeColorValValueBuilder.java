package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.SchemeColorValValueModel;

public class SchemeColorValValueBuilder {
  private SchemeColorValValueModel value;

  public SchemeColorValValueBuilder() {
    this.value = null;
  }

  public SchemeColorValValueBuilder from(SchemeColorValValueModel value) {
    this.value = value;
    return this;
  }

  public SchemeColorValValueModel build() {
    return this.value;
  }

  public SchemeColorValValueBuilder setValue(SchemeColorValValueModel value) {
    this.value = value;
    return this;
  }
}
