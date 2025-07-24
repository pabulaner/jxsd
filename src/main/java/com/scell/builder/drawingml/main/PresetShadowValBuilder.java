package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetShadowValModel;

public class PresetShadowValBuilder {
  private PresetShadowValModel value;

  public PresetShadowValBuilder() {
    this.value = null;
  }

  public PresetShadowValBuilder from(PresetShadowValModel value) {
    this.value = value;
    return this;
  }

  public PresetShadowValModel build() {
    return this.value;
  }

  public PresetShadowValBuilder setValue(PresetShadowValModel value) {
    this.value = value;
    return this;
  }
}
