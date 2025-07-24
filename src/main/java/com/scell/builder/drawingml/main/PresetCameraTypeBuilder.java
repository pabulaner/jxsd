package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetCameraTypeModel;

public class PresetCameraTypeBuilder {
  private PresetCameraTypeModel value;

  public PresetCameraTypeBuilder() {
    this.value = null;
  }

  public PresetCameraTypeBuilder from(PresetCameraTypeModel value) {
    this.value = value;
    return this;
  }

  public PresetCameraTypeModel build() {
    return this.value;
  }

  public PresetCameraTypeBuilder setValue(PresetCameraTypeModel value) {
    this.value = value;
    return this;
  }
}
