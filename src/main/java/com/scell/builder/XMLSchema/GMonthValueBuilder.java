package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GMonthValueModel;

public class GMonthValueBuilder {
  private int value;

  public GMonthValueBuilder() {
  }

  public GMonthValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public GMonthValueBuilder from(GMonthValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public GMonthValueModel build() {
    return new GMonthValueModel(this.value);
  }
}
