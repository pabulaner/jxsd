package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetMaterialTypeModel;

public class PresetMaterialTypeBuilder {
  private PresetMaterialTypeModel value;

  public PresetMaterialTypeBuilder() {
    this.value = null;
  }

  public PresetMaterialTypeBuilder from(PresetMaterialTypeModel value) {
    this.value = value;
    return this;
  }

  public PresetMaterialTypeModel build() {
    return this.value;
  }

  public PresetMaterialTypeBuilder setValue(PresetMaterialTypeModel value) {
    this.value = value;
    return this;
  }
}
