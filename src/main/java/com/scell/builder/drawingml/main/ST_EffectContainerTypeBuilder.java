package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_EffectContainerTypeModel;

public class ST_EffectContainerTypeBuilder {
  private ST_EffectContainerTypeModel value;

  public ST_EffectContainerTypeBuilder() {
    this.value = null;
  }

  public ST_EffectContainerTypeBuilder from(ST_EffectContainerTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_EffectContainerTypeModel build() {
    return this.value;
  }

  public ST_EffectContainerTypeBuilder setValue(ST_EffectContainerTypeModel value) {
    this.value = value;
    return this;
  }
}
