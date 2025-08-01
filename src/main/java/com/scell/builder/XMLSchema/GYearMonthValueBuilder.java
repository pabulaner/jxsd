package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GYearMonthValueModel;

public class GYearMonthValueBuilder {
  private int value;

  public GYearMonthValueBuilder() {
  }

  public GYearMonthValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public GYearMonthValueBuilder from(GYearMonthValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public GYearMonthValueModel build() {
    return new GYearMonthValueModel(this.value);
  }
}
