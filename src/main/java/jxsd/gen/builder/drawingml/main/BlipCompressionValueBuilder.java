package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BlipCompressionValueModel;

/**
 * This is a generated enum class.
 */
public class BlipCompressionValueBuilder {
  private BlipCompressionValueModel value;

  public BlipCompressionValueBuilder() {
  }

  public BlipCompressionValueBuilder setValue(BlipCompressionValueModel value) {
    this.value = value;
    return this;
  }

  public BlipCompressionValueBuilder from(BlipCompressionValueModel value) {
    this.value = value;
    return this;
  }

  public BlipCompressionValueModel build() {
    return this.value;
  }
}
