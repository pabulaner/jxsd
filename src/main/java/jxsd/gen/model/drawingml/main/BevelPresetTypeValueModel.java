package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.BevelPresetTypeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum BevelPresetTypeValueModel {
  RELAXED_INSET,

  CIRCLE,

  SLOPE,

  CROSS,

  ANGLE,

  SOFT_ROUND,

  CONVEX,

  COOL_SLANT,

  DIVOT,

  RIBLET,

  HARD_EDGE,

  ART_DECO;

  public BevelPresetTypeValueBuilder builder() {
    return new BevelPresetTypeValueBuilder().from(this);
  }
}
