package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.EffectContainerTypeValueModel;

public class EffectContainerTypeValueBuilder {
  private EffectContainerTypeValueModel value;

  public EffectContainerTypeValueBuilder() {
    this.value = null;
  }

  public EffectContainerTypeValueBuilder from(EffectContainerTypeValueModel value) {
    this.value = value;
    return this;
  }

  public EffectContainerTypeValueModel build() {
    return this.value;
  }

  public EffectContainerTypeValueBuilder setValue(EffectContainerTypeValueModel value) {
    this.value = value;
    return this;
  }
}
