package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.GDayModel;

public class GDayBuilder {
  private Integer value;

  public GDayBuilder() {
    this.value = null;
  }

  public GDayBuilder setValue(Integer value) {
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
