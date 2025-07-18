package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TileFlipModeModel;

public class ST_TileFlipModeBuilder {
  private ST_TileFlipModeModel value;

  public ST_TileFlipModeBuilder() {
    this.value = null;
  }

  public ST_TileFlipModeBuilder from(ST_TileFlipModeModel value) {
    this.value = value;
    return this;
  }

  public ST_TileFlipModeModel build() {
    return this.value;
  }

  public ST_TileFlipModeBuilder setValue(ST_TileFlipModeModel value) {
    this.value = value;
    return this;
  }
}
