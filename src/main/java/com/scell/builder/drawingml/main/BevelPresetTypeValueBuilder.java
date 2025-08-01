package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BevelPresetTypeValueModel;

public class BevelPresetTypeValueBuilder {
  private BevelPresetTypeValueModel value;

  public BevelPresetTypeValueBuilder() {
    this.value = null;
  }

  public BevelPresetTypeValueBuilder from(BevelPresetTypeValueModel value) {
    this.value = value;
    return this;
  }

  public BevelPresetTypeValueModel build() {
    return this.value;
  }

  public BevelPresetTypeValueBuilder setValue(BevelPresetTypeValueModel value) {
    this.value = value;
    return this;
  }
}
