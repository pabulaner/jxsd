package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.LineCapValueBuilder;

/**
 * This is a generated enum class.
 */
public enum LineCapValueModel {
  RND,

  SQ,

  FLAT;

  public LineCapValueBuilder builder() {
    return new LineCapValueBuilder().from(this);
  }
}
