package jxsd.gen.converter.drawingml.main;

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
    if (value == STBlackWhiteMode.CLR) return BlackWhiteModeValueModel.CLR;
    if (value == STBlackWhiteMode.AUTO) return BlackWhiteModeValueModel.AUTO;
    if (value == STBlackWhiteMode.GRAY) return BlackWhiteModeValueModel.GRAY;
    if (value == STBlackWhiteMode.LT_GRAY) return BlackWhiteModeValueModel.LT_GRAY;
    if (value == STBlackWhiteMode.INV_GRAY) return BlackWhiteModeValueModel.INV_GRAY;
    if (value == STBlackWhiteMode.GRAY_WHITE) return BlackWhiteModeValueModel.GRAY_WHITE;
    if (value == STBlackWhiteMode.BLACK_GRAY) return BlackWhiteModeValueModel.BLACK_GRAY;
    if (value == STBlackWhiteMode.BLACK_WHITE) return BlackWhiteModeValueModel.BLACK_WHITE;
    if (value == STBlackWhiteMode.BLACK) return BlackWhiteModeValueModel.BLACK;
    if (value == STBlackWhiteMode.WHITE) return BlackWhiteModeValueModel.WHITE;
    if (value == STBlackWhiteMode.HIDDEN) return BlackWhiteModeValueModel.HIDDEN;
    return null;
  }

  public static STBlackWhiteMode toDocx4j(BlackWhiteModeValueModel value) {
    if (value == null) return null;
    if (value == BlackWhiteModeValueModel.CLR) return STBlackWhiteMode.CLR;
    if (value == BlackWhiteModeValueModel.AUTO) return STBlackWhiteMode.AUTO;
    if (value == BlackWhiteModeValueModel.GRAY) return STBlackWhiteMode.GRAY;
    if (value == BlackWhiteModeValueModel.LT_GRAY) return STBlackWhiteMode.LT_GRAY;
    if (value == BlackWhiteModeValueModel.INV_GRAY) return STBlackWhiteMode.INV_GRAY;
    if (value == BlackWhiteModeValueModel.GRAY_WHITE) return STBlackWhiteMode.GRAY_WHITE;
    if (value == BlackWhiteModeValueModel.BLACK_GRAY) return STBlackWhiteMode.BLACK_GRAY;
    if (value == BlackWhiteModeValueModel.BLACK_WHITE) return STBlackWhiteMode.BLACK_WHITE;
    if (value == BlackWhiteModeValueModel.BLACK) return STBlackWhiteMode.BLACK;
    if (value == BlackWhiteModeValueModel.WHITE) return STBlackWhiteMode.WHITE;
    if (value == BlackWhiteModeValueModel.HIDDEN) return STBlackWhiteMode.HIDDEN;
    return null;
  }
}
