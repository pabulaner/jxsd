package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TileFlipModeValueModel;

/**
 * This is a generated enum class.
 */
public class TileFlipModeValueBuilder {
  private TileFlipModeValueModel value;

  public TileFlipModeValueBuilder() {
  }

  public TileFlipModeValueBuilder setValue(TileFlipModeValueModel value) {
    this.value = value;
    return this;
  }

  public TileFlipModeValueBuilder from(TileFlipModeValueModel value) {
    this.value = value;
    return this;
  }

  public TileFlipModeValueModel build() {
    return this.value;
  }
}
