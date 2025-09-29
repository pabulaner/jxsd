package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.BlackWhiteModeValueBuilder;
import jxsd.gen.model.drawingml.main.BlackWhiteModeValueModel;
import org.docx4j.dml.STBlackWhiteMode;

/**
 * This is a generated enum class.
 */
public class BlackWhiteModeValueConverter {
  private BlackWhiteModeValueConverter() {
  }

  public static BlackWhiteModeValueModel fromDocx4j(STBlackWhiteMode value) {
    if (value == null) return null;
    if (value == BlackWhiteModeValueBuilder.CLR) return BlackWhiteModeValueModel.CLR;
    if (value == BlackWhiteModeValueBuilder.AUTO) return BlackWhiteModeValueModel.AUTO;
    if (value == BlackWhiteModeValueBuilder.GRAY) return BlackWhiteModeValueModel.GRAY;
    if (value == BlackWhiteModeValueBuilder.LT_GRAY) return BlackWhiteModeValueModel.LT_GRAY;
    if (value == BlackWhiteModeValueBuilder.INV_GRAY) return BlackWhiteModeValueModel.INV_GRAY;
    if (value == BlackWhiteModeValueBuilder.GRAY_WHITE) return BlackWhiteModeValueModel.GRAY_WHITE;
    if (value == BlackWhiteModeValueBuilder.BLACK_GRAY) return BlackWhiteModeValueModel.BLACK_GRAY;
    if (value == BlackWhiteModeValueBuilder.BLACK_WHITE) return BlackWhiteModeValueModel.BLACK_WHITE;
    if (value == BlackWhiteModeValueBuilder.BLACK) return BlackWhiteModeValueModel.BLACK;
    if (value == BlackWhiteModeValueBuilder.WHITE) return BlackWhiteModeValueModel.WHITE;
    if (value == BlackWhiteModeValueBuilder.HIDDEN) return BlackWhiteModeValueModel.HIDDEN;
    return null;
  }

  public static STBlackWhiteMode toDocx4j(BlackWhiteModeValueModel value) {
    if (value == null) return null;
    if (value == BlackWhiteModeValueModel.CLR) return BlackWhiteModeValueBuilder.CLR;
    if (value == BlackWhiteModeValueModel.AUTO) return BlackWhiteModeValueBuilder.AUTO;
    if (value == BlackWhiteModeValueModel.GRAY) return BlackWhiteModeValueBuilder.GRAY;
    if (value == BlackWhiteModeValueModel.LT_GRAY) return BlackWhiteModeValueBuilder.LT_GRAY;
    if (value == BlackWhiteModeValueModel.INV_GRAY) return BlackWhiteModeValueBuilder.INV_GRAY;
    if (value == BlackWhiteModeValueModel.GRAY_WHITE) return BlackWhiteModeValueBuilder.GRAY_WHITE;
    if (value == BlackWhiteModeValueModel.BLACK_GRAY) return BlackWhiteModeValueBuilder.BLACK_GRAY;
    if (value == BlackWhiteModeValueModel.BLACK_WHITE) return BlackWhiteModeValueBuilder.BLACK_WHITE;
    if (value == BlackWhiteModeValueModel.BLACK) return BlackWhiteModeValueBuilder.BLACK;
    if (value == BlackWhiteModeValueModel.WHITE) return BlackWhiteModeValueBuilder.WHITE;
    if (value == BlackWhiteModeValueModel.HIDDEN) return BlackWhiteModeValueBuilder.HIDDEN;
    return null;
  }
}
