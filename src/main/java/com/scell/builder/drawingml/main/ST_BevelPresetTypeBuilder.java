package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_BevelPresetTypeModel;

public class ST_BevelPresetTypeBuilder {
  private ST_BevelPresetTypeModel value;

  public ST_BevelPresetTypeBuilder() {
    this.value = null;
  }

  public ST_BevelPresetTypeBuilder from(ST_BevelPresetTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_BevelPresetTypeModel build() {
    return this.value;
  }

  public ST_BevelPresetTypeBuilder setValue(ST_BevelPresetTypeModel value) {
    this.value = value;
    return this;
  }
}
