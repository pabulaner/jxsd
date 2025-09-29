package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextUnderlineTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum TextUnderlineTypeValueModel {
  NONE,

  WORDS,

  SNG,

  DBL,

  HEAVY,

  DOTTED,

  DOTTED_HEAVY,

  DASH,

  DASH_HEAVY,

  DASH_LONG,

  DASH_LONG_HEAVY,

  DOT_DASH,

  DOT_DASH_HEAVY,

  DOT_DOT_DASH,

  DOT_DOT_DASH_HEAVY,

  WAVY,

  WAVY_HEAVY,

  WAVY_DBL;

  public TextUnderlineTypeValueBuilder builder() {
    return new TextUnderlineTypeValueBuilder().from(this);
  }
}
