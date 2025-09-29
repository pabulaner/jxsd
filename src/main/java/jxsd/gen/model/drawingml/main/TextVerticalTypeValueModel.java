package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextVerticalTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum TextVerticalTypeValueModel {
  HORZ,

  VERT,

  VERT_270,

  WORD_ART_VERT,

  EA_VERT,

  MONGOLIAN_VERT,

  WORD_ART_VERT_RTL;

  public TextVerticalTypeValueBuilder builder() {
    return new TextVerticalTypeValueBuilder().from(this);
  }
}
