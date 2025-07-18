package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GMonthDayModel;

public class GMonthDayBuilder {
  private Integer value;

  public GMonthDayBuilder() {
    this.value = null;
  }

  public GMonthDayBuilder setValue(Integer value) {
    this.value = value;
    return this;
  }

  public GMonthDayBuilder from(GMonthDayModel value) {
    this.value = value.getValue();
    return this;
  }

  public GMonthDayModel build() {
    return new GMonthDayModel(this.value);
  }
}
