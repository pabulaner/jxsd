package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetColorValModel;

public class ST_PresetColorValBuilder {
  private ST_PresetColorValModel value;

  public ST_PresetColorValBuilder() {
    this.value = null;
  }

  public ST_PresetColorValBuilder from(ST_PresetColorValModel value) {
    this.value = value;
    return this;
  }

  public ST_PresetColorValModel build() {
    return this.value;
  }

  public ST_PresetColorValBuilder setValue(ST_PresetColorValModel value) {
    this.value = value;
    return this;
  }
}
