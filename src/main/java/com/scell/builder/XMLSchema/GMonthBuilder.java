package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GMonthModel;

public class GMonthBuilder {
  private int value;

  public GMonthBuilder() {
  }

  public GMonthBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public GMonthBuilder from(GMonthModel value) {
    this.value = value.getValue();
    return this;
  }

  public GMonthModel build() {
    return new GMonthModel(this.value);
  }
}
