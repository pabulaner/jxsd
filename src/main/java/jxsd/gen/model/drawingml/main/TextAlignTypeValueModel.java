package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextAlignTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum TextAlignTypeValueModel {
  L,

  CTR,

  R,

  JUST,

  JUST_LOW,

  DIST,

  THAI_DIST;

  public TextAlignTypeValueBuilder builder() {
    return new TextAlignTypeValueBuilder().from(this);
  }
}
