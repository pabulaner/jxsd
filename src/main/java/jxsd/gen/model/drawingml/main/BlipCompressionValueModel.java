package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.BlipCompressionValueBuilder;

/**
 * This is a generated enum class.
 */
public enum BlipCompressionValueModel {
  EMAIL,

  SCREEN,

  PRINT,

  HQPRINT,

  NONE;

  public BlipCompressionValueBuilder builder() {
    return new BlipCompressionValueBuilder().from(this);
  }
}
