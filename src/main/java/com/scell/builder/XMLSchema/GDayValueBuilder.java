package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GDayValueModel;

public class GDayValueBuilder {
  private int value;

  public GDayValueBuilder() {
  }

  public GDayValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public GDayValueBuilder from(GDayValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public GDayValueModel build() {
    return new GDayValueModel(this.value);
  }
}
