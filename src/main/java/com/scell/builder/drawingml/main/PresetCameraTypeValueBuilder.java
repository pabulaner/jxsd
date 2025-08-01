package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetCameraTypeValueModel;

public class PresetCameraTypeValueBuilder {
  private PresetCameraTypeValueModel value;

  public PresetCameraTypeValueBuilder() {
    this.value = null;
  }

  public PresetCameraTypeValueBuilder from(PresetCameraTypeValueModel value) {
    this.value = value;
    return this;
  }

  public PresetCameraTypeValueModel build() {
    return this.value;
  }

  public PresetCameraTypeValueBuilder setValue(PresetCameraTypeValueModel value) {
    this.value = value;
    return this;
  }
}
