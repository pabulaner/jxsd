package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.RectAlignmentValueBuilder;

/**
 * This is a generated enum class.
 */
public enum RectAlignmentValueModel {
  TL,

  T,

  TR,

  L,

  CTR,

  R,

  BL,

  B,

  BR;

  public RectAlignmentValueBuilder builder() {
    return new RectAlignmentValueBuilder().from(this);
  }
}
