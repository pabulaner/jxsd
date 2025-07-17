package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_BlendModeModel;

public class ST_BlendModeBuilder {
  private ST_BlendModeModel value;

  public ST_BlendModeBuilder() {
    this.value = null;
  }

  public ST_BlendModeBuilder from(ST_BlendModeModel value) {
    this.value = value;
    return this;
  }

  public ST_BlendModeModel build() {
    return this.value;
  }

  public ST_BlendModeBuilder setValue(ST_BlendModeModel value) {
    this.value = value;
    return this;
  }
}
