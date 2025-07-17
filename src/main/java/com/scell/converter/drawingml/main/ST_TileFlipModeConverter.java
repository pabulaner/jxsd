package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TileFlipModeModel;
import org.docx4j.dml.STTileFlipMode;

public class ST_TileFlipModeConverter {
  private ST_TileFlipModeConverter() {
  }

  public static ST_TileFlipModeModel fromDocx4j(STTileFlipMode value) {
    if (value == null) return null;
    if (value == STTileFlipMode.NONE) return ST_TileFlipModeModel.NONE;
    if (value == STTileFlipMode.X) return ST_TileFlipModeModel.X;
    if (value == STTileFlipMode.Y) return ST_TileFlipModeModel.Y;
    if (value == STTileFlipMode.XY) return ST_TileFlipModeModel.XY;
    return null;
  }

  public static STTileFlipMode toDocx4j(ST_TileFlipModeModel value) {
    return null;
  }
}
