package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GYearMonthModel;

public class GYearMonthBuilder {
  private int value;

  public GYearMonthBuilder() {
  }

  public GYearMonthBuilder setValue(int value) {
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
