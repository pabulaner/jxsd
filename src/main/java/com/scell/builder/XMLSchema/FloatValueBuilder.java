package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.FloatValueModel;

public class FloatValueBuilder {
  private float value;

  public FloatValueBuilder() {
  }

  public FloatValueBuilder setValue(float value) {
    this.value = value;
    return this;
  }

  public FloatValueBuilder from(FloatValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public FloatValueModel build() {
    return new FloatValueModel(this.value);
  }
}
