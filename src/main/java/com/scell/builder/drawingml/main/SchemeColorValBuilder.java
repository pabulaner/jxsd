package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.SchemeColorValModel;

public class SchemeColorValBuilder {
  private SchemeColorValModel value;

  public SchemeColorValBuilder() {
    this.value = null;
  }

  public SchemeColorValBuilder from(SchemeColorValModel value) {
    this.value = value;
    return this;
  }

  public SchemeColorValModel build() {
    return this.value;
  }

  public SchemeColorValBuilder setValue(SchemeColorValModel value) {
    this.value = value;
    return this;
  }
}
