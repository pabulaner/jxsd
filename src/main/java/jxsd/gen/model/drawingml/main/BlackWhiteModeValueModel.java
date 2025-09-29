package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.BlackWhiteModeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum BlackWhiteModeValueModel {
  CLR,

  AUTO,

  GRAY,

  LT_GRAY,

  INV_GRAY,

  GRAY_WHITE,

  BLACK_GRAY,

  BLACK_WHITE,

  BLACK,

  WHITE,

  HIDDEN;

  public BlackWhiteModeValueBuilder builder() {
    return new BlackWhiteModeValueBuilder().from(this);
  }
}
