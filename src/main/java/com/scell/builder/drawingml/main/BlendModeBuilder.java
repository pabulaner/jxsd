package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlendModeModel;

public class BlendModeBuilder {
  private BlendModeModel value;

  public BlendModeBuilder() {
    this.value = null;
  }

  public BlendModeBuilder from(BlendModeModel value) {
    this.value = value;
    return this;
  }

  public BlendModeModel build() {
    return this.value;
  }

  public BlendModeBuilder setValue(BlendModeModel value) {
    this.value = value;
    return this;
  }
}
