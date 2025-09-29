package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PathFillModeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum PathFillModeValueModel {
  NONE,

  NORM,

  LIGHTEN,

  LIGHTEN_LESS,

  DARKEN,

  DARKEN_LESS;

  public PathFillModeValueBuilder builder() {
    return new PathFillModeValueBuilder().from(this);
  }
}
