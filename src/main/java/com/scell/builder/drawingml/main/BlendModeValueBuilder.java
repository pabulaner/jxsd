package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlendModeValueModel;

public class BlendModeValueBuilder {
  private BlendModeValueModel value;

  public BlendModeValueBuilder() {
    this.value = null;
  }

  public BlendModeValueBuilder from(BlendModeValueModel value) {
    this.value = value;
    return this;
  }

  public BlendModeValueModel build() {
    return this.value;
  }

  public BlendModeValueBuilder setValue(BlendModeValueModel value) {
    this.value = value;
    return this;
  }
}
