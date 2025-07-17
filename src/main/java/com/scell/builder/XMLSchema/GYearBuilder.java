package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GYearModel;

public class GYearBuilder {
  private Integer value;

  public GYearBuilder() {
    this.value = null;
  }

  public GYearBuilder setValue(Integer value) {
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
