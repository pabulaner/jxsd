package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GYearValueModel;

public class GYearValueBuilder {
  private int value;

  public GYearValueBuilder() {
  }

  public GYearValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public GYearValueBuilder from(GYearValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public GYearValueModel build() {
    return new GYearValueModel(this.value);
  }
}
