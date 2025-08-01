package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TileFlipModeValueModel;

public class TileFlipModeValueBuilder {
  private TileFlipModeValueModel value;

  public TileFlipModeValueBuilder() {
    this.value = null;
  }

  public TileFlipModeValueBuilder from(TileFlipModeValueModel value) {
    this.value = value;
    return this;
  }

  public TileFlipModeValueModel build() {
    return this.value;
  }

  public TileFlipModeValueBuilder setValue(TileFlipModeValueModel value) {
    this.value = value;
    return this;
  }
}
