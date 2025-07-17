package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PresetLineDashValModel;

public class ST_PresetLineDashValBuilder {
  private ST_PresetLineDashValModel value;

  public ST_PresetLineDashValBuilder() {
    this.value = null;
  }

  public ST_PresetLineDashValBuilder from(ST_PresetLineDashValModel value) {
    this.value = value;
    return this;
  }

  public ST_PresetLineDashValModel build() {
    return this.value;
  }

  public ST_PresetLineDashValBuilder setValue(ST_PresetLineDashValModel value) {
    this.value = value;
    return this;
  }
}
