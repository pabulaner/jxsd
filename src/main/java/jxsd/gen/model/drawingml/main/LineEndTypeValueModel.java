package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.LineEndTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum LineEndTypeValueModel {
  NONE,

  TRIANGLE,

  STEALTH,

  DIAMOND,

  OVAL,

  ARROW;

  public LineEndTypeValueBuilder builder() {
    return new LineEndTypeValueBuilder().from(this);
  }
}
