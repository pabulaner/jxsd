package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TileFlipModeValueBuilder;
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
    if (value == TileFlipModeValueBuilder.NONE) return TileFlipModeValueModel.NONE;
    if (value == TileFlipModeValueBuilder.X) return TileFlipModeValueModel.X;
    if (value == TileFlipModeValueBuilder.Y) return TileFlipModeValueModel.Y;
    if (value == TileFlipModeValueBuilder.XY) return TileFlipModeValueModel.XY;
    return null;
  }

  public static STTileFlipMode toDocx4j(TileFlipModeValueModel value) {
    if (value == null) return null;
    if (value == TileFlipModeValueModel.NONE) return TileFlipModeValueBuilder.NONE;
    if (value == TileFlipModeValueModel.X) return TileFlipModeValueBuilder.X;
    if (value == TileFlipModeValueModel.Y) return TileFlipModeValueBuilder.Y;
    if (value == TileFlipModeValueModel.XY) return TileFlipModeValueBuilder.XY;
    return null;
  }
}
