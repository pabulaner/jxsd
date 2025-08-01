package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TileFlipModeValueModel;
import org.docx4j.dml.STTileFlipMode;

public class TileFlipModeValueConverter {
  private TileFlipModeValueConverter() {
  }

  public static TileFlipModeValueModel fromDocx4J(STTileFlipMode value) {
    if (value == null) return null;
    if (value == STTileFlipMode.NONE) return TileFlipModeValueModel.NONE;
    if (value == STTileFlipMode.X) return TileFlipModeValueModel.X;
    if (value == STTileFlipMode.Y) return TileFlipModeValueModel.Y;
    if (value == STTileFlipMode.XY) return TileFlipModeValueModel.XY;
    return null;
  }
}
