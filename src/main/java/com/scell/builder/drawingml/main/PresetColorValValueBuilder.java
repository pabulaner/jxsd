package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetColorValValueModel;

public class PresetColorValValueBuilder {
  private PresetColorValValueModel value;

  public PresetColorValValueBuilder() {
    this.value = null;
  }

  public PresetColorValValueBuilder from(PresetColorValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetColorValValueModel build() {
    return this.value;
  }

  public PresetColorValValueBuilder setValue(PresetColorValValueModel value) {
    this.value = value;
    return this;
  }
}
