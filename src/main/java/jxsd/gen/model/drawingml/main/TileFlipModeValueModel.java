package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TileFlipModeValueBuilder;

/**
 * This is a generated enum class.
 */
public enum TileFlipModeValueModel {
  NONE,

  X,

  Y,

  XY;

  public TileFlipModeValueBuilder builder() {
    return new TileFlipModeValueBuilder().from(this);
  }
}
