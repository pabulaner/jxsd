package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextStrikeTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum TextStrikeTypeValueModel {
  NO_STRIKE,

  SNG_STRIKE,

  DBL_STRIKE;

  public TextStrikeTypeValueBuilder builder() {
    return new TextStrikeTypeValueBuilder().from(this);
  }
}
