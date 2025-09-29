package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PathShadeTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum PathShadeTypeValueModel {
  SHAPE,

  CIRCLE,

  RECT;

  public PathShadeTypeValueBuilder builder() {
    return new PathShadeTypeValueBuilder().from(this);
  }
}
