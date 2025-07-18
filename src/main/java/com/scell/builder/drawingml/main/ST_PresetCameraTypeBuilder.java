package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetCameraTypeModel;

public class ST_PresetCameraTypeBuilder {
  private ST_PresetCameraTypeModel value;

  public ST_PresetCameraTypeBuilder() {
    this.value = null;
  }

  public ST_PresetCameraTypeBuilder from(ST_PresetCameraTypeModel value) {
    this.value = value;
    return this;
  }

  public ST_PresetCameraTypeModel build() {
    return this.value;
  }

  public ST_PresetCameraTypeBuilder setValue(ST_PresetCameraTypeModel value) {
    this.value = value;
    return this;
  }
}
