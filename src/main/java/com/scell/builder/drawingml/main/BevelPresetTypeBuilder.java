package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BevelPresetTypeModel;

public class BevelPresetTypeBuilder {
  private BevelPresetTypeModel value;

  public BevelPresetTypeBuilder() {
    this.value = null;
  }

  public BevelPresetTypeBuilder from(BevelPresetTypeModel value) {
    this.value = value;
    return this;
  }

  public BevelPresetTypeModel build() {
    return this.value;
  }

  public BevelPresetTypeBuilder setValue(BevelPresetTypeModel value) {
    this.value = value;
    return this;
  }
}
