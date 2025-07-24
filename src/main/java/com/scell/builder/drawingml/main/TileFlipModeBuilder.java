package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TileFlipModeModel;

public class TileFlipModeBuilder {
  private TileFlipModeModel value;

  public TileFlipModeBuilder() {
    this.value = null;
  }

  public TileFlipModeBuilder from(TileFlipModeModel value) {
    this.value = value;
    return this;
  }

  public TileFlipModeModel build() {
    return this.value;
  }

  public TileFlipModeBuilder setValue(TileFlipModeModel value) {
    this.value = value;
    return this;
  }
}
