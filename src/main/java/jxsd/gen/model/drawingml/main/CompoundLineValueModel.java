package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.CompoundLineValueBuilder;

/**
 * This is a generated enum class.
 */
public enum CompoundLineValueModel {
  SNG,

  DBL,

  THICK_THIN,

  THIN_THICK,

  TRI;

  public CompoundLineValueBuilder builder() {
    return new CompoundLineValueBuilder().from(this);
  }
}
