package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.EffectContainerTypeModel;

public class EffectContainerTypeBuilder {
  private EffectContainerTypeModel value;

  public EffectContainerTypeBuilder() {
    this.value = null;
  }

  public EffectContainerTypeBuilder from(EffectContainerTypeModel value) {
    this.value = value;
    return this;
  }

  public EffectContainerTypeModel build() {
    return this.value;
  }

  public EffectContainerTypeBuilder setValue(EffectContainerTypeModel value) {
    this.value = value;
    return this;
  }
}
