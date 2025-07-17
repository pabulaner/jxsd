package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetMaterialTypeModel;

public class ST_PresetMaterialTypeBuilder {
  private ST_PresetMaterialTypeModel value;

  public ST_PresetMaterialTypeBuilder() {
    this.value = null;
  }

  public ST_PresetMaterialTypeBuilder from(ST_PresetMaterialTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_PresetMaterialTypeModel build() {
    return this.value;
  }

  public ST_PresetMaterialTypeBuilder setValue(ST_PresetMaterialTypeModel value) {
    this.value = value;
    return this;
  }
}
