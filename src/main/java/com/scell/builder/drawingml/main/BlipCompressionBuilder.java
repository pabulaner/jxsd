package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlipCompressionModel;

public class BlipCompressionBuilder {
  private BlipCompressionModel value;

  public BlipCompressionBuilder() {
    this.value = null;
  }

  public BlipCompressionBuilder from(BlipCompressionModel value) {
    this.value = value;
    return this;
  }

  public BlipCompressionModel build() {
    return this.value;
  }

  public BlipCompressionBuilder setValue(BlipCompressionModel value) {
    this.value = value;
    return this;
  }
}
