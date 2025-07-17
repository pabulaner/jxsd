package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.FloatModel;

public class FloatBuilder {
  private Float value;

  public FloatBuilder() {
    this.value = null;
  }

  public FloatBuilder setValue(Float value) {
    this.value = value;
    return this;
  }

  public FloatBuilder from(FloatModel value) {
    this.value = value.getValue();
    return this;
  }

  public FloatModel build() {
    return new FloatModel(this.value);
  }
}
