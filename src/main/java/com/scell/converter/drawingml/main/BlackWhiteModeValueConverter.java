package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.BlackWhiteModeValueModel;
import org.docx4j.dml.STBlackWhiteMode;

public class BlackWhiteModeValueConverter {
  private BlackWhiteModeValueConverter() {
  }

  public static BlackWhiteModeValueModel fromDocx4J(STBlackWhiteMode value) {
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
}
