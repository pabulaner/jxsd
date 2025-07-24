package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TileFlipModeModel;
import org.docx4j.dml.STTileFlipMode;

public class TileFlipModeConverter {
  private TileFlipModeConverter() {
  }

  public static TileFlipModeModel fromDocx4J(STTileFlipMode value) {
    if (value == null) return null;
    if (value == STTileFlipMode.NONE) return TileFlipModeModel.NONE;
    if (value == STTileFlipMode.X) return TileFlipModeModel.X;
    if (value == STTileFlipMode.Y) return TileFlipModeModel.Y;
    if (value == STTileFlipMode.XY) return TileFlipModeModel.XY;
    return null;
  }
}
