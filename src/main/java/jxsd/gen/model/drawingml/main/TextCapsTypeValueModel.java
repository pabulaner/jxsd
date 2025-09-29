package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextCapsTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum TextCapsTypeValueModel {
  NONE,

  SMALL,

  ALL;

  public TextCapsTypeValueBuilder builder() {
    return new TextCapsTypeValueBuilder().from(this);
  }
}
