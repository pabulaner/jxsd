package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.FloatModel;

public class FloatBuilder {
  private float value;

  public FloatBuilder() {
  }

  public FloatBuilder setValue(float value) {
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
