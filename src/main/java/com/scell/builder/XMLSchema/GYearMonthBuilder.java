package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GYearMonthModel;

public class GYearMonthBuilder {
  private Integer value;

  public GYearMonthBuilder() {
    this.value = null;
  }

  public GYearMonthBuilder setValue(Integer value) {
    this.value = value;
    return this;
  }

  public GYearMonthBuilder from(GYearMonthModel value) {
    this.value = value.getValue();
    return this;
  }

  public GYearMonthModel build() {
    return new GYearMonthModel(this.value);
  }
}
