package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GDayModel;

public class GDayBuilder {
  private int value;

  public GDayBuilder() {
  }

  public GDayBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public GDayBuilder from(GDayModel value) {
    this.value = value.getValue();
    return this;
  }

  public GDayModel build() {
    return new GDayModel(this.value);
  }
}
