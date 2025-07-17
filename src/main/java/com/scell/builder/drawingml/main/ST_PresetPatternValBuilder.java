package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetPatternValModel;

public class ST_PresetPatternValBuilder {
  private ST_PresetPatternValModel value;

  public ST_PresetPatternValBuilder() {
    this.value = null;
  }

  public ST_PresetPatternValBuilder from(ST_PresetPatternValModel value) {
    this.value = value;
    return this;
  }

  public ST_PresetPatternValModel build() {
    return this.value;
  }

  public ST_PresetPatternValBuilder setValue(ST_PresetPatternValModel value) {
    this.value = value;
    return this;
  }
}
