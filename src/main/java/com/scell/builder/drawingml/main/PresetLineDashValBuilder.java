package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetLineDashValModel;

public class PresetLineDashValBuilder {
  private PresetLineDashValModel value;

  public PresetLineDashValBuilder() {
    this.value = null;
  }

  public PresetLineDashValBuilder from(PresetLineDashValModel value) {
    this.value = value;
    return this;
  }

  public PresetLineDashValModel build() {
    return this.value;
  }

  public PresetLineDashValBuilder setValue(PresetLineDashValModel value) {
    this.value = value;
    return this;
  }
}
