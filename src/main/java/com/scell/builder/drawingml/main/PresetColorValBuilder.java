package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetColorValModel;

public class PresetColorValBuilder {
  private PresetColorValModel value;

  public PresetColorValBuilder() {
    this.value = null;
  }

  public PresetColorValBuilder from(PresetColorValModel value) {
    this.value = value;
    return this;
  }

  public PresetColorValModel build() {
    return this.value;
  }

  public PresetColorValBuilder setValue(PresetColorValModel value) {
    this.value = value;
    return this;
  }
}
