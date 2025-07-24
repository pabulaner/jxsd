package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetPatternValModel;

public class PresetPatternValBuilder {
  private PresetPatternValModel value;

  public PresetPatternValBuilder() {
    this.value = null;
  }

  public PresetPatternValBuilder from(PresetPatternValModel value) {
    this.value = value;
    return this;
  }

  public PresetPatternValModel build() {
    return this.value;
  }

  public PresetPatternValBuilder setValue(PresetPatternValModel value) {
    this.value = value;
    return this;
  }
}
