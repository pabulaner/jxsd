package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.BlendModeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum BlendModeValueModel {
  OVER,

  MULT,

  SCREEN,

  DARKEN,

  LIGHTEN;

  public BlendModeValueBuilder builder() {
    return new BlendModeValueBuilder().from(this);
  }
}
