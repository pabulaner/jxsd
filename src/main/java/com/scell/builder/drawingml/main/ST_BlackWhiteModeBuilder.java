package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_BlackWhiteModeModel;

public class ST_BlackWhiteModeBuilder {
  private ST_BlackWhiteModeModel value;

  public ST_BlackWhiteModeBuilder() {
    this.value = null;
  }

  public ST_BlackWhiteModeBuilder from(ST_BlackWhiteModeModel value) {
    this.value = value;
    return this;
  }

  public ST_BlackWhiteModeModel build() {
    return this.value;
  }

  public ST_BlackWhiteModeBuilder setValue(ST_BlackWhiteModeModel value) {
    this.value = value;
    return this;
  }
}
