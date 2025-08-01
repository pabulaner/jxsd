package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetShadowValValueModel;

public class PresetShadowValValueBuilder {
  private PresetShadowValValueModel value;

  public PresetShadowValValueBuilder() {
    this.value = null;
  }

  public PresetShadowValValueBuilder from(PresetShadowValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetShadowValValueModel build() {
    return this.value;
  }

  public PresetShadowValValueBuilder setValue(PresetShadowValValueModel value) {
    this.value = value;
    return this;
  }
}
