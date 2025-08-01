package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetMaterialTypeValueModel;

public class PresetMaterialTypeValueBuilder {
  private PresetMaterialTypeValueModel value;

  public PresetMaterialTypeValueBuilder() {
    this.value = null;
  }

  public PresetMaterialTypeValueBuilder from(PresetMaterialTypeValueModel value) {
    this.value = value;
    return this;
  }

  public PresetMaterialTypeValueModel build() {
    return this.value;
  }

  public PresetMaterialTypeValueBuilder setValue(PresetMaterialTypeValueModel value) {
    this.value = value;
    return this;
  }
}
