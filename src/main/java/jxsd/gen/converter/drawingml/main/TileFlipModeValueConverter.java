package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TileFlipModeValueModel;
import org.docx4j.dml.STTileFlipMode;

/**
 * This is a generated enum class.
 */
public class TileFlipModeValueConverter {
  private TileFlipModeValueConverter() {
  }

  public static TileFlipModeValueModel fromDocx4j(STTileFlipMode value) {
    if (value == null) return null;
    if (value == STTileFlipMode.NONE) return TileFlipModeValueModel.NONE;
    if (value == STTileFlipMode.X) return TileFlipModeValueModel.X;
    if (value == STTileFlipMode.Y) return TileFlipModeValueModel.Y;
    if (value == STTileFlipMode.XY) return TileFlipModeValueModel.XY;
    return null;
  }

  public static STTileFlipMode toDocx4j(TileFlipModeValueModel value) {
    if (value == null) return null;
    if (value == TileFlipModeValueModel.NONE) return STTileFlipMode.NONE;
    if (value == TileFlipModeValueModel.X) return STTileFlipMode.X;
    if (value == TileFlipModeValueModel.Y) return STTileFlipMode.Y;
    if (value == TileFlipModeValueModel.XY) return STTileFlipMode.XY;
    return null;
  }
}
