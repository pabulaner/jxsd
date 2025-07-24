package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GYearModel;

public class GYearBuilder {
  private int value;

  public GYearBuilder() {
  }

  public GYearBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public GYearBuilder from(GYearModel value) {
    this.value = value.getValue();
    return this;
  }

  public GYearModel build() {
    return new GYearModel(this.value);
  }
}
