package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetLineDashValValueModel;

public class PresetLineDashValValueBuilder {
  private PresetLineDashValValueModel value;

  public PresetLineDashValValueBuilder() {
    this.value = null;
  }

  public PresetLineDashValValueBuilder from(PresetLineDashValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetLineDashValValueModel build() {
    return this.value;
  }

  public PresetLineDashValValueBuilder setValue(PresetLineDashValValueModel value) {
    this.value = value;
    return this;
  }
}
