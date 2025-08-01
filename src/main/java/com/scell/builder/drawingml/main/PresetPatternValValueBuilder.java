package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PresetPatternValValueModel;

public class PresetPatternValValueBuilder {
  private PresetPatternValValueModel value;

  public PresetPatternValValueBuilder() {
    this.value = null;
  }

  public PresetPatternValValueBuilder from(PresetPatternValValueModel value) {
    this.value = value;
    return this;
  }

  public PresetPatternValValueModel build() {
    return this.value;
  }

  public PresetPatternValValueBuilder setValue(PresetPatternValValueModel value) {
    this.value = value;
    return this;
  }
}
