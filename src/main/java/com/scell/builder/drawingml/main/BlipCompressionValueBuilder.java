package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlipCompressionValueModel;

public class BlipCompressionValueBuilder {
  private BlipCompressionValueModel value;

  public BlipCompressionValueBuilder() {
    this.value = null;
  }

  public BlipCompressionValueBuilder from(BlipCompressionValueModel value) {
    this.value = value;
    return this;
  }

  public BlipCompressionValueModel build() {
    return this.value;
  }

  public BlipCompressionValueBuilder setValue(BlipCompressionValueModel value) {
    this.value = value;
    return this;
  }
}
