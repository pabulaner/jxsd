package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetShadowValModel;

public class ST_PresetShadowValBuilder {
  private ST_PresetShadowValModel value;

  public ST_PresetShadowValBuilder() {
    this.value = null;
  }

  public ST_PresetShadowValBuilder from(ST_PresetShadowValModel value) {
    this.value = value;
    return this;
  }

  public ST_PresetShadowValModel build() {
    return this.value;
  }

  public ST_PresetShadowValBuilder setValue(ST_PresetShadowValModel value) {
    this.value = value;
    return this;
  }
}
