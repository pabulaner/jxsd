package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GMonthDayValueModel;

public class GMonthDayValueBuilder {
  private int value;

  public GMonthDayValueBuilder() {
  }

  public GMonthDayValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public GMonthDayValueBuilder from(GMonthDayValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public GMonthDayValueModel build() {
    return new GMonthDayValueModel(this.value);
  }
}
